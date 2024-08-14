package org.javaacademy.core.homework.OOPEx5;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;
import static java.math.BigDecimal.valueOf;

public class CalcFinancialResult {

    private static final BigDecimal TAX_RATE_BEFORE_LOW_LIMIT = new BigDecimal("0.08");
    private static final BigDecimal LOW_LIMIT_TAX = valueOf((1_000_000));
    private static final BigDecimal TAX_RATE_AFTER_LOW_LIMIT = new BigDecimal("0.1");
    private static final BigDecimal HIGH_LIMIT_TAX = valueOf(2_000_000);
    private static final BigDecimal TAX_RATE_AFTER_HIGH_LIMIT = new BigDecimal("0.13");

    private BigDecimal priceSausage;
    private BigDecimal priceHam;
    private BigDecimal priceNeck;
    private BigDecimal costSausage;
    private BigDecimal costHam;
    private BigDecimal costNeck;

    public CalcFinancialResult(String priceSausage, String priceHam, String priceNeck) {

        this.priceHam = new BigDecimal(priceHam);
        this.priceNeck = new BigDecimal(priceNeck);
        this.priceSausage = new BigDecimal(priceSausage);
    }

    /**
     *
     */
    public void calculateProfitTax(long countSausage, long countHam, long countNeck) {
        calculateCost(countSausage, countNeck);
        BigDecimal totalIncome = calculateIncome(countSausage, countHam, countNeck);
        BigDecimal totalOutcome = calculateOutcome(countSausage, countHam, countNeck);
        // Прибыль до налога
        BigDecimal profitBeforeTax = totalIncome.subtract(totalOutcome);
        if(profitBeforeTax.compareTo(ZERO) < 0) {
            System.out.println("Налог: " + 0);
            System.out.println("Прибыль после налога: " + profitBeforeTax);
        }
        BigDecimal totalTax = calculateTax(profitBeforeTax);
        BigDecimal profitAfterTax = profitBeforeTax.subtract(totalTax);
        System.out.println("Налог составил: " + totalTax);
        System.out.println("Прибыль после налога: " + profitAfterTax);
    }

    /**
     * Расчёт себестоимости
     */
    private void calculateCost(long countSausage, long countNeck) {

        if (countSausage < 1000) {
            this.costSausage = valueOf(412);
        } else if (countSausage >= 1000 && countSausage < 2000) {
            this.costSausage = valueOf(408);
        } else {
            this.costSausage = valueOf(408);
        }

        this.costHam = valueOf(275);
        this.costNeck = countNeck < 500 ? valueOf(311) : valueOf(299);
    }

    /**
     * Расчёт дохода
     */

    private BigDecimal calculateIncome(long countSausage, long countHam, long countNeck) {
        BigDecimal totalIncomeSausage = priceSausage.multiply(valueOf(countSausage));
        BigDecimal totalIncomeHam = priceHam.multiply(valueOf(countHam));
        BigDecimal totalIncomeNeck = priceSausage.multiply(valueOf(countNeck));
        BigDecimal totalIncome = totalIncomeSausage.add(totalIncomeHam).add(totalIncomeNeck);

        return totalIncome;
    }

    /**
     * Расчёт расхода
     */
    private BigDecimal calculateOutcome(long countSausage, long countHam, long countNeck) {
        BigDecimal totalOutcomeSausage = costSausage.multiply(valueOf(countSausage));
        BigDecimal totalOutcomeHam = costHam.multiply(valueOf(countHam));
        BigDecimal totalOutcomeNeck = costNeck.multiply(valueOf(countNeck));
        // Постоянные расходы
        BigDecimal outcomeConstant = valueOf(1_000_000);
        BigDecimal totalOutcome = totalOutcomeSausage.add(totalOutcomeHam).add(totalOutcomeNeck);

        return totalOutcome;
    }


    /**
     * расчёт налога
     */

    private BigDecimal calculateTax(BigDecimal profitBeforeTax) {

        BigDecimal totalTax = ZERO;
        // Расчёт нижнего лимита
        if (profitBeforeTax.compareTo(LOW_LIMIT_TAX) < 0) {
            BigDecimal taxBeforeLowLimit = TAX_RATE_BEFORE_LOW_LIMIT.multiply(profitBeforeTax);
            totalTax = totalTax.add(taxBeforeLowLimit);

            // Расчёт для среднего лимита и оверлимита
            if (profitBeforeTax.compareTo(HIGH_LIMIT_TAX) < 0) {
                BigDecimal taxAfterLowLimit = profitBeforeTax.subtract(LOW_LIMIT_TAX)
                        .multiply(TAX_RATE_AFTER_LOW_LIMIT);
                totalTax = totalTax.add(taxAfterLowLimit);
            } else {
                BigDecimal taxAfterLowLimit = HIGH_LIMIT_TAX.subtract(LOW_LIMIT_TAX)
                        .multiply(TAX_RATE_AFTER_LOW_LIMIT);
                BigDecimal taxAfterHighLimit = profitBeforeTax.subtract(HIGH_LIMIT_TAX)
                        .multiply(TAX_RATE_AFTER_HIGH_LIMIT);
                totalTax = totalTax.add(taxAfterLowLimit).add(taxAfterHighLimit);
            }
        }
        return totalTax;
    }
}



