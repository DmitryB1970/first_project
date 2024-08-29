package org.javaacademy.core.homework5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Runner {

    public static final int COUNTRY_NAME = 0;
    public static final int SUM_AMOUNT = 1;

    public static void main(String[] args) throws FileNotFoundException {
        ex1();
        ex2();


    }

    private static void ex1() {

        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        String filename = "donation.csv";

        BigDecimal sumRussia = BigDecimal.ZERO;
        BigDecimal sumFrance = BigDecimal.ZERO;
        BigDecimal sumChina = BigDecimal.ZERO;
        BigDecimal sumJapan = BigDecimal.ZERO;
        BigDecimal sumTurkey = BigDecimal.ZERO;

        Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));

        while (scanner.hasNext()) {
            String[] donationsSum = scanner.nextLine().replace(",", ".").replace(";", ",").split(",");
            if ((donationsSum[1].matches("-?\\d+(\\.\\d+)?"))) {
                switch (donationsSum[COUNTRY_NAME]) {
                    case "Россия":
                        sumRussia = sumRussia.add(BigDecimal.valueOf(Double.parseDouble(donationsSum[SUM_AMOUNT])));
                        break;
                    case "Франция":
                        sumFrance = sumFrance.add(BigDecimal.valueOf(Double.parseDouble(donationsSum[SUM_AMOUNT])));
                        break;
                    case "Китай":
                        sumChina = sumChina.add(BigDecimal.valueOf(Double.parseDouble(donationsSum[SUM_AMOUNT])));
                        break;
                    case "Япония":
                        sumJapan = sumJapan.add(BigDecimal.valueOf(Double.parseDouble(donationsSum[SUM_AMOUNT])));
                        break;
                    case "Турция":
                        sumTurkey = sumTurkey.add(BigDecimal.valueOf(Double.parseDouble(donationsSum[SUM_AMOUNT])));
                        break;
                }
            }
        }

        System.out.printf("%s - %.2f\n", "Россия", sumRussia);
        System.out.printf("%s - %.2f\n", "Франция", sumFrance);
        System.out.printf("%s - %.2f\n", "Китай", sumChina);
        System.out.printf("%s - %.2f\n", "Япония", sumJapan);
        System.out.printf("%s - %.2f\n", "Турция", sumTurkey);
    }


    private static void ex2() {
        //Сделать компьютерного шпиона
        //Смысл задания - отслеживать действия реального объекта и записывать их в лог
        //Создать компьютер:
        //1. Компьютер хранит в себе пользователя, который вошел в компьютер
        //2. Компьютер умеет:
        //2.1. Делать вход пользователя (на вход имя пользователя).
        // Изменяет пользователя, который зашел в компьютер
        //2.2 Делать выход пользователя. Удаляет пользователя из системы
        //2.3. Отправляет сообщение (на вход текст сообщения).
        // Печатает на экран "сообщение: {текст сообщения}".

        //Создать компьютерного шпиона, который наследуется от компьютера,
        // при этом хранит в себе обычный компьютер
        //Сделать так, чтобы при вызове методов компьютерного шпиона:
        //1. При входе пользователя делалась запись в comp.log "Пользователь {имя пользователя} вошел"
        // и вызывался метод компьютера.
        //2. При выходе делалась запись в comp.log "Пользователь вышел"
        //3. При отправке сообщения, делалась запись в comp.log:
        // "Пользователь {имя пользователя} отправил сообщение {текст сообщения}"
        // и вызвался метод компьютера.

        //Создать Runner
        //1. В нем создать компьютер.
        //2. Создать шпиона с компьютером из пункта 1
        //3. Сделать вход пользователя, отправку сообщения, выход пользователя через компьютерного шпиона.
        //4. Проверить наличие логов в comp.log
        // (файл должен быть внутри репозитория и отправлен в удаленное репо)


        Computer.User user = new Computer.User("Иван");
        Computer computer = new Computer();
        ComputerSpy computerSpy = new ComputerSpy(computer);
        try {
            computerSpy.userEnter(user.getUserName());
            computerSpy.sendMessage("Отправка сообщения");
            computerSpy.userExit("Сергей");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String filename = "comp.log";
        Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));
//        computerSpy.readFile();
//
//
    }


}


