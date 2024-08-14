package org.javaacademy.core.homework3.shop;

public class Runner {
    public static void main(String[] args) {

        Customer customer = new Customer("Вася");
        Shop shop = new Shop(false, true, 3);
        customer.checkShop(shop);
    }
}
