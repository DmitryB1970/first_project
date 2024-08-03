package org.javaacademy.core.homework2.office;

public class Security {

    private String name;

    public String getName() {
        return name;
    }

    public Security(String name) {
        this.name = name;
    }

    public void askAdvancePayment() {
        System.out.println("Выдайте мне аванс!");
    }
}
