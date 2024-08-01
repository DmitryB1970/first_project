package org.javaacademy.core.homework;

/**
 * Необходимо написать калькулятор. Алгоритм:
 * 1. Вывести на экран: Введите первое число
 * 2. Получить число с помощью Double.parseDouble(scanner.nextLine()), сохранить его в переменную
 * 3. Вывести на экран: Введите знак операции - "+", "-", "*", "/"
 * 4. Получить текст с помощью scanner.nextLine(), сохранить его в переменную
 * 4. Вывести на экран: Введите второе число
 * 5. Получить число с помощью Double.parseDouble(scanner.nextLine()), сохранить его в переменную
 * 6. В зависимости от знака операции произвести соответствующую операцию. Вывести результат на экран.
 * Если знак операции не относится к перечисленным выше, вывести - "Ошибка"
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число ");
        double firstNumber = Double.parseDouble(scanner.nextLine());
        System.out.print("Введите знак операции - \"+\", \"-\", \"*\", \"/\" ");
        String mark = scanner.nextLine();
        System.out.print("Введите второе число ");
        double secondNumber = Double.parseDouble(scanner.nextLine());

        if (mark.equals("+")) {
            System.out.println(firstNumber + secondNumber);
        } else if (mark.equals("-")) {
            System.out.println(firstNumber - secondNumber);
        } else if (mark.equals("*")) {
            System.out.println(firstNumber * secondNumber);
        } else if (mark.equals("/")) {
            System.out.println(firstNumber / secondNumber);
        } else {
            System.out.println("Ошибка");
        }
        scanner.close();
    }
}
