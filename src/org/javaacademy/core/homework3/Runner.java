package org.javaacademy.core.homework3;

import org.javaacademy.core.homework3.immutablecity.City;
import org.javaacademy.core.homework3.immutablecity.House;
import org.javaacademy.core.homework3.phoneFabric.TwoPhonesFabric;
import org.javaacademy.core.homework3.piramid.Piramid1;

public class Runner {

    public static void main(String[] args) {

        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        org.javaacademy.core.homework3.shop.Runner runner = new org.javaacademy.core.homework3.shop.Runner();
    }

    public static void ex2() {

        TwoPhonesFabric.createPhones();
    }

    public static void ex3() {

        Piramid1 piramid1 = new Piramid1();
        piramid1.print();
    }

    /**
     * Для продвинутых
     */
    public static void ex4() {
        //Зада: Иммутабельный город.
        //
        //Создать класс House (наименование улицы, номер дома) - создать сеттеры! и геттеры на него.
        //Переопределить вывод в текст - вывод улицы и номера дома
        //Создать иммутабельный класс City (наименование города, и массив домов).
        //Переопределить вывод в текст - чтобы выводило имя города, и все дома
        //
        //1. Создать два дома, создать город с массивом созданных домов
        //2. Сделать так, чтобы у города нельзя было поменять свойства.
        //3. Сделать так, что если дом получен из города, то при изменении свойств этого дома,
        // эти изменения не затронут дом находящийся внутри города.
        // Т.е. результат должен соответствовать псевдокоду ниже:
        //
        //[] - квадратные скобки - массив
        //{} - объект
        // City city = new City([{new House('Lenina', 1)}], "Мурманск");
        // System.out.println(city);
        //-- City{[House{street: Lenina, house: 1}], name: "Мурманск"}
        //House house = city.getHouses()[0];
        //house.setStreet('Kotova');
        //System.out.println(house);
        //-- House{street: Kotova, house: 1}
        //System.out.println(city);
        //-- City{House{street: Lenina, house: 1}}

        House house1 = new House( 15, "Tverskaya");
        House house2 = new House(2, "Polevaya");
        City city = new City("Moscow", new House[]{house1, house2});
        System.out.println(city);

        House house = city.getHouse()[0];
        System.out.println(house);

        house.setStreetName("Polyarnaya");
        System.out.println(house);

        System.out.println(city);



    }

}
