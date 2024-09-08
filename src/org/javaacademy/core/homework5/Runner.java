package org.javaacademy.core.homework5;

import org.javaacademy.core.homework5.ex2.Computer;
import org.javaacademy.core.homework5.ex2.ComputerSpy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Runner {

    private static final int COUNTRY_FIELD_INDEX = 0;
    private static final int MONEY_FIELD_INDEX = 1;
    private static final int MINIMUM_FIELDS_COUNT = 2;
    private static final String DELIMETER = ";";


    public static void main(String[] args) {
        ex1();
        ex2();
    }

    private static void ex1() {

        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        BigDecimal[] moneyForCountry = new BigDecimal[countries.length];
        Arrays.fill(moneyForCountry, BigDecimal.ZERO);


        String filename = "donation.csv";

        try (Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));) {
            readAllLines(scanner, moneyForCountry, countries);
        }

        System.out.println("Список пожертвований по странам");
        for (int i = 0; i < countries.length; i++) {
            System.out.printf("%s - %s\n", countries[i], moneyForCountry[i]);
        }
    }

    private static void readAllLines(Scanner scanner, BigDecimal[] moneyForCountry, String[] countries) {
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            BigDecimal moneyFromCountry = getNumberFromLine(text);
            addMoneyToCountryResult(countries, moneyForCountry, moneyFromCountry, getCountryName(text));
        }
    }

    private static BigDecimal getNumberFromLine(String textLine) {
        String[] fields = textLine.split(DELIMETER);
        if (fields.length >= MINIMUM_FIELDS_COUNT && isNumber(fields[MONEY_FIELD_INDEX])) {
            String convertedMoney = fields[MONEY_FIELD_INDEX].replace(",", ".");
            return new BigDecimal(convertedMoney);
        }
        return BigDecimal.ZERO;
    }

    private static boolean isNumber(String text) {
        Pattern pattern = Pattern.compile("^\\d+,\\d+$");
        return pattern.matcher(text).find();
    }

    private static String getCountryName(String textLine) {
        String[] fields = textLine.split(DELIMETER);
        if (fields.length == 0) {
            return "";
        }
        return fields[COUNTRY_FIELD_INDEX];
    }

    private static void addMoneyToCountryResult(String[] countries, BigDecimal[] countryResults,
                                                BigDecimal moneyForCountry,
                                                String countryName) {

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals(countryName)) {
                countryResults[i] = countryResults[i].add(moneyForCountry);
            }
        }
    }

    private static void ex2() {
        Computer computer = new Computer();
        ComputerSpy computerSpy = new ComputerSpy(computer);
        computerSpy.login("Юрий");
        computerSpy.sendMessage("Ура");
        computerSpy.logout();
    }
}


