package org.javaacademy.core.homework4.ex1;

public class AutomobileCar extends Car {
    private boolean isCruiseControl;

    public AutomobileCar(boolean isDirty, double width, double height, double length, boolean isCruiseControl) {
        super(isDirty, width, height, length);
        this.isCruiseControl = isCruiseControl;
    }
}
