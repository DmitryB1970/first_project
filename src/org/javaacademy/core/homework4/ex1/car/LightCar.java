package org.javaacademy.core.homework4.ex1.car;

public class LightCar extends Car {

    private final boolean isCruiseControl;

    public LightCar(double height, double length, double width, boolean isCruiseControl) {
        super(height, length, width);
        this.isCruiseControl = isCruiseControl;
    }

    public LightCar(boolean isClean, double width, double height, double length, boolean isCruiseControl) {
        super(isClean, width, height, length);
        this.isCruiseControl = isCruiseControl;
    }

    public boolean isCruiseControl() {
        return isCruiseControl;
    }
}
