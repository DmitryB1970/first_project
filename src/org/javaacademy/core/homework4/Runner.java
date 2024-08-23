package org.javaacademy.core.homework4;

import org.javaacademy.core.homework4.ex1.Bus;
import org.javaacademy.core.homework4.ex1.Car;
import org.javaacademy.core.homework4.ex1.CarWash;
import org.javaacademy.core.homework4.ex1.LightCar;
import org.javaacademy.core.homework4.ex2.Airplane;
import org.javaacademy.core.homework4.ex2.Duck;
import org.javaacademy.core.homework4.ex2.FlyException;
import org.javaacademy.core.homework4.ex3.*;
import org.javaacademy.core.homework4.ex4.animal.Elephant;
import org.javaacademy.core.homework4.ex4.animal.Rabbit;
import org.javaacademy.core.homework4.ex4.animal.Tiger;
import org.javaacademy.core.homework4.ex4.animal.Wolf;
import org.javaacademy.core.homework4.ex4.exception.AnimalCantAttackException;
import org.javaacademy.core.homework4.ex4.exception.AnimalCantRunException;

import java.math.BigDecimal;

public class Runner {

    public static void main(String[] args) {
        ex1();
        System.out.println("------------------------------------------------");
        ex2();
        System.out.println("------------------------------------------------");
        ex3();
        System.out.println("------------------------------------------------");
        ex4();   // сделал не до конца
    }

    @SuppressWarnings("checkstyle:Indentation")
    public static void ex1() {

        Car[] lightCar = {
                new LightCar(true, 1.8, 2, 5, true),
                new LightCar(true, 1.8, 2, 5, true),
                new LightCar(true, 1.8, 2, 5, true),
                new LightCar(true, 1.8, 2, 5, true)
        };
        Car[] bus = {
                new Bus(true, 2.3, 3, 12, 40),
                new Bus(true, 2.3, 3, 12, 40),
                new Bus(true, 2.3, 3, 12, 40),
                new Bus(true, 2.3, 3, 12, 40),
                new Bus(true, 2.3, 3, 12, 40),
        };
        CarWash carWash = new CarWash();
        System.out.println("Категория легкового автомобиля: " + carWash.category(lightCar[0]));
        System.out.println("Категория автобуса: " + carWash.category(bus[0]));
        System.out.println("Стоимость мойки одного легкового автомобиля: " + carWash.costOneWashCar(lightCar[0]));
        System.out.println("Стоимость мойки одного автобуса: " + carWash.costOneWashCar(bus[0]));
        BigDecimal lightCarsCost = carWash.costForAllWashCars(lightCar);
        BigDecimal busCost = carWash.costForAllWashCars(bus);
        BigDecimal allCarsWashCost = lightCarsCost.add(busCost);
        System.out.println("Общая стоимость мойки всех машин: " + allCarsWashCost);
    }

    public static void ex2() {

        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);

        try {
            duck1.fly();
        } catch (FlyException e) {
            System.out.println("Ошибка: утка ранена");
        }

        try {
            duck2.fly();
        } catch (FlyException e) {
            System.out.println("Ошибка: утка ранена");
        }

        try {
            airplane1.fly();
        } catch (FlyException e) {
            System.out.println("Ошибка: пассажиров в самолете меньше 0");
        }

        try {
            airplane2.fly();
        } catch (FlyException e) {
            System.out.println("Ошибка: пассажиров в самолете меньше 0");
        }
    }

    public static void ex3() {

        Soundable human = new Human();
        Soundable builder = new Builder();
        Soundable driver = new Driver();
        Soundable bird = new Bird();

        Soundable[] array = {human, builder, driver, bird};

        for (Soundable soundable : array) {
            soundable.makeSound();
        }

    }

    public static void ex4() {
        //Задача №4 - Страсти по Дарвину
        //Создать следующую структуру
        //             Живое
        //       /             \
        //    Хищник             Травоядное
        //    /   \              /         \
        // волк   тигр       кролик        слон
        //
        //Живое - обладает свойством жив/мертв, вес. Умеет умирать - переход в состояние мертв.
        //
        //Хищник
        //Умеет нападать на живое. В случае если вес жертвы больше хищника, то хищник погибает,
        //иначе вес хищника увеличивается на треть веса жертвы и жертва погибает.
        //Может нападать только при живом состоянии, иначе выпадает ошибка "Животное не может нападать".
        //
        //Травоядное - умеет бегать (не определено как).
        // Но все травоядные могут бегать только в состоянии живое.
        //Иначе выдает ошибку - "Животное не может бегать".
        //
        //Тигр умеет нападать на живое, но за счет ловкости может сьесть жертву весом до двух раз больше него.
        //Остальные условия такие же как при нападении хищника.
        //
        //Волк - не обладает уникальными свойствами или действиями.
        //Кролик - умеет бегать (печать "кролик быстро бежит")
        //Слон - умеет бегать (печать "слон медленно бежит")
        //
        //Создать отдельный пакет и Runner. В Runner:
        //1.Создать Тигра(300 кг), Волка(50 кг), кролика(2 кг), Слона (2000 кг)
        //2.Кролик должен пробежать
        //3.Волк ест кролика
        //4.Тигр ест волка
        //5.Тигр пытается съесть слона
        //6.Слон пробегает
        //7.Вызвать у съеденного кролика бег, сделать так, чтобы программа НЕ закончилась с ошибкой,
        //а распечатала текст ошибки.

        Tiger tiger = new Tiger(true, 300, true);
        Wolf wolf = new Wolf(true, 50);
        Rabbit rabbit = new Rabbit(true, 2);
        Elephant elephant = new Elephant(true, 2000);

        try {
            rabbit.run();
            System.out.println(rabbit.isAlive());
        } catch (AnimalCantRunException e) {
            e.getMessage();
        }

        try {
            wolf.attack(rabbit);
        } catch (AnimalCantAttackException e) {
            e.getMessage();
        }

        try {
            tiger.attack(wolf);
        } catch (AnimalCantAttackException e) {
            e.getMessage();
        }

        try {
            tiger.attack(elephant);
        } catch (AnimalCantAttackException e) {
            e.getMessage();
        }

        try {
            elephant.run();
        } catch (AnimalCantRunException e) {
            e.getMessage();
        }

        try {
            rabbit.run();
        } catch (AnimalCantRunException e) {
            e.getMessage();
        }
    }
}
