package org.javaacademy.core.homework4.ex2;

public class Duck implements Flyable {

    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Утка подстрелена и лететь не может");
        }
        System.out.println("Утка летит");
    }
}