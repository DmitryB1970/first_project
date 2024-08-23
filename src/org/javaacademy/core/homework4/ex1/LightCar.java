package org.javaacademy.core.homework4.ex1;

public class LightCar extends Car {

    private boolean isCruiseControl;

    public LightCar(boolean isDirty, double width, double height, double length, boolean isCruiseControl) {
        super(isDirty, width, height, length);
        this.isCruiseControl = isCruiseControl;
    }
}
