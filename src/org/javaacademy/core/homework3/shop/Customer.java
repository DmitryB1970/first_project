package org.javaacademy.core.homework3.shop;

/**
 * Покупатель
 */
public class Customer {
    private String name;

    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }

    void checkShop(Shop shop) {

        if ((shop.getCountWorkers() > 2 && shop.isWorkersHasBadge()) || shop.isClearFloor()) {
            System.out.println(name + ": Магазин прошел проверку");
        } else {
            System.out.println(name + ": Магазин не прошел проверку!");
        }
    }
}
