package org.javaacademy.core.homework4.ex1;

public class Bus extends Car {

    private int maxPassengers;

    public Bus(boolean isDirty, double width, double height, double length, int maxPassengers) {
        super(isDirty, width, height, length);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
