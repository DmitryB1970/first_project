package org.javaacademy.core.homework4.ex1.car;

public class Bus extends Car {

    private final int maxPassengers;

    public Bus(double height, double length, double width, int maxPassengers) {
        super(height, length, width);
        this.maxPassengers = maxPassengers;
    }

    public Bus(boolean isClean, double width, double height, double length, int maxPassengers) {
        super(isClean, width, height, length);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
