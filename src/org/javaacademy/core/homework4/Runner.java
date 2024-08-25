package org.javaacademy.core.homework4;

import org.javaacademy.core.homework4.ex1.car.Bus;
import org.javaacademy.core.homework4.ex1.car.Car;
import org.javaacademy.core.homework4.ex1.car.CarWashing;
import org.javaacademy.core.homework4.ex1.car.LightCar;
import org.javaacademy.core.homework4.ex2.Airplane;
import org.javaacademy.core.homework4.ex2.Duck;
import org.javaacademy.core.homework4.ex2.FlyException;
import org.javaacademy.core.homework4.ex2.Flyable;
import org.javaacademy.core.homework4.ex3.*;
import org.javaacademy.core.homework4.ex4.animal.herbivore.Elephant;
import org.javaacademy.core.homework4.ex4.animal.herbivore.Rabbit;
import org.javaacademy.core.homework4.ex4.animal.predator.Tiger;
import org.javaacademy.core.homework4.ex4.animal.predator.Wolf;
import org.javaacademy.core.homework4.ex4.exception.ActionForDeadAliveException;

public class Runner {

    public static void main(String[] args) {
        ex1();
        System.out.println("------------------------------------------------");
        ex2();
        System.out.println("------------------------------------------------");
        ex3();
        System.out.println("------------------------------------------------");
        ex4();
    }


    public static void ex1() {

        int countLightCars = 4;
        int countBusCars = 5;

        Car[] cars = new Car[countLightCars + countBusCars];
        for (int i = 0; i < 4; i++) {
            cars[i] = new LightCar(2, 5, 1.8, true);
        }

        for (int i = countLightCars; i < countLightCars + countBusCars; i++) {
            cars[i] = new Bus(3, 12, 2.3, 50);
        }

        CarWashing carWashing = new CarWashing();
        System.out.println("Общая стоимость мойки всех машин: " + carWashing.wash(cars));
    }

    public static void ex2() {

        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);

        for (Flyable flyable : new Flyable[]{duck1, duck2, airplane1, airplane2}) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void ex3() {

        Soundable human = new Human();
        Soundable builder = new Builder();
        Soundable driver = new Driver();
        Soundable bird = new Bird();

        Soundable[] makingSound = {human, builder, driver, bird};

        for (Soundable soundable : makingSound) {
            System.out.println(soundable.makeSound());
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

        Tiger tiger = new Tiger(300);
        Wolf wolf = new Wolf(50);
        Rabbit rabbit = new Rabbit(2);
        Elephant elephant = new Elephant(2000);

        rabbit.run();
        wolf.attack(rabbit);
        tiger.attack(wolf);
        tiger.attack(elephant);
        elephant.run();
        try {
            rabbit.run();
        } catch (ActionForDeadAliveException e) {
            System.out.println(e.getMessage());
        }
    }
}
