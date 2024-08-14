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

        House house1 = new House(15, "Tverskaya");
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
