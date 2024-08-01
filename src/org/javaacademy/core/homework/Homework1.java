package org.javaacademy.core.homework;

import java.math.BigDecimal;

public class Homework1 {

    public static void main(String[] args) {
        ex2();
        System.out.println("___________________________________________");
        ex3();
        System.out.println("___________________________________________");
        ex4();
        System.out.println("___________________________________________");
        advanced();
    }

    public static void ex1() {
        //Открыть класс Calc, там задание!

    }

    public static void ex2() {

        String name = "     ПЕтРов Олег Иванович     ";

        name = name.trim().toUpperCase();
        if (name.toLowerCase().contains("ова")) {
            System.out.println("Уважаемая " + name);
        } else if (name.toLowerCase().contains("ов")) {
            System.out.println("Уважаемый " + name);
        } else {
            System.out.println("Неизвестное лицо " + name);
        }
    }

    public static void ex3() {
        //У нас есть машина. В данной машине есть перечень проверок, перед запуском двигателя
        //Количество топлива
        double fuel = 10;
        //Работоспособен или нет двигатель
        boolean isEngineWork = true;
        //Есть ли ошибки в компьютере (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if (!(fuel < 10) && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                || hasErrors && isEngineWork) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }

    public static void ex4() {
        String simply = "this is simply. This is my favorite song.";
        System.out.println(simply.replaceAll("this is", "those are"));
//      Если ещё надо поменять слово с заглавной буквой - This is, на Those are то:
        System.out.println(simply.replace("this is", "those are")
                .replace("This is", "Those are"));
        System.out.println(simply.lastIndexOf('o'));
    }

    /**
     * Для продвинутых!
     * Принимается только при использовании класса BigDecimal в расчетах.
     */


    public static void advanced() {

        BigDecimal sausagePrice = new BigDecimal("800");
        BigDecimal costPriceSausageWeightLess1000kg = new BigDecimal("412");
        BigDecimal costPriceSausageWeightBetween1000and2000kg = new BigDecimal("408");
        BigDecimal costPriceSausageWeightEqualsOrMoreThan2000kg = new BigDecimal("404");

        BigDecimal hamPrice = new BigDecimal("350");
        BigDecimal costPriceHam = new BigDecimal("275");

        BigDecimal meatNeckPrice = new BigDecimal("500");
        BigDecimal costPriceMeatNeckWeightLess500kg = new BigDecimal("311");
        BigDecimal costPriceMeatNeckWeightEqualOrMoreThan500kg = new BigDecimal("299");

        BigDecimal sausageWeight = new BigDecimal("2000");
        BigDecimal hamWeight = new BigDecimal("8511");
        BigDecimal meatNeckWeight = new BigDecimal("6988");

        BigDecimal income = sausagePrice.multiply(sausageWeight).add(hamPrice.multiply(hamWeight)
                .add(meatNeckPrice.multiply(meatNeckWeight)));
        System.out.println("Доход компании: " + income);

        BigDecimal expenses;

        if (sausageWeight.doubleValue() < 1000 && meatNeckWeight.doubleValue() < 500) {
            expenses = costPriceSausageWeightLess1000kg.multiply(sausageWeight)
                    .add(costPriceHam.multiply(hamWeight)
                            .add(costPriceMeatNeckWeightLess500kg.multiply(meatNeckWeight)));
        } else if (sausageWeight.doubleValue() >= 1000 && sausageWeight.doubleValue() < 2000
                && meatNeckWeight.doubleValue() < 500) {
            expenses = costPriceSausageWeightBetween1000and2000kg.multiply(sausageWeight)
                    .add(costPriceHam.multiply(hamWeight).
                            add(costPriceMeatNeckWeightLess500kg.multiply(meatNeckWeight)));
        } else if (sausageWeight.doubleValue() > 2000 && meatNeckWeight.doubleValue() < 500) {
            expenses = costPriceSausageWeightEqualsOrMoreThan2000kg.multiply(sausageWeight)
                    .add(costPriceHam.multiply(hamWeight).
                            add(costPriceMeatNeckWeightLess500kg.multiply(meatNeckWeight)));
        } else if ((sausageWeight.doubleValue() < 1000 && meatNeckWeight.doubleValue() > 500)) {
            expenses = costPriceSausageWeightLess1000kg.multiply(sausageWeight)
                    .add(costPriceHam.multiply(hamWeight)
                            .add(costPriceMeatNeckWeightEqualOrMoreThan500kg.multiply(meatNeckWeight)));
        } else if (sausageWeight.doubleValue() >= 1000 && sausageWeight.doubleValue() < 2000
                && meatNeckWeight.doubleValue() > 500) {
            expenses = costPriceSausageWeightBetween1000and2000kg.multiply(sausageWeight)
                    .add(costPriceHam.multiply(hamWeight).
                            add(costPriceMeatNeckWeightEqualOrMoreThan500kg.multiply(meatNeckWeight)));
        } else {
            expenses = costPriceSausageWeightEqualsOrMoreThan2000kg.multiply(sausageWeight)
                    .add(costPriceHam.multiply(hamWeight)
                            .add(costPriceMeatNeckWeightEqualOrMoreThan500kg.multiply(meatNeckWeight)));
        }
        System.out.println("Расход компании: " + expenses);

        BigDecimal profitBeforeTaxes = income.subtract(expenses);
        System.out.println("Прибыль до налогов: " + profitBeforeTaxes);

        BigDecimal percentRate13 = new BigDecimal("13");
        BigDecimal percentRate10 = new BigDecimal("10");
        BigDecimal percentRate8 = new BigDecimal("8");

        BigDecimal hundredPercent = new BigDecimal("100");

        BigDecimal amount2_000_000 = new BigDecimal("2000000");
        BigDecimal amount1_000_000 = new BigDecimal("1000000");

        BigDecimal taxes;

        if (profitBeforeTaxes.compareTo(amount2_000_000) > 0) {
            taxes = profitBeforeTaxes.subtract(amount2_000_000).divide(hundredPercent).multiply(percentRate13)
                    .add(amount1_000_000.divide(hundredPercent).multiply(percentRate10))
                    .add(amount1_000_000.divide(hundredPercent).multiply(percentRate8));
            System.out.println("Налоги: " + taxes);
        } else if (profitBeforeTaxes.compareTo(amount2_000_000) < 0 && profitBeforeTaxes.compareTo(amount1_000_000) > 0)
        {
            taxes = profitBeforeTaxes.subtract(amount1_000_000).divide(hundredPercent).multiply(percentRate10)
                    .add(amount1_000_000.divide(hundredPercent).multiply(percentRate8));
            System.out.println("Налоги: " + taxes);
        } else if (profitBeforeTaxes.compareTo(amount1_000_000) < 0) {
            taxes = profitBeforeTaxes.divide(hundredPercent).multiply(percentRate8);
            System.out.println("Налоги: " + taxes);
        }
    }
}
