package org.javaacademy.core.homework2.office;

public class Boss {

    private String name;

    public String getName() {
        return name;
    }

    public Boss(String name) {
        this.name = name;
    }

    public void customize(Manager manager) {
        System.out.println(manager.getName() + ", быстрее!");
    }
}
