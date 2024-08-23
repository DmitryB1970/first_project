package org.javaacademy.core.homework4.ex1;

public abstract class Car {

    protected boolean isDirty;
    protected double width;
    protected double height;
    protected double length;

    public Car(boolean isDirty, double width, double height, double length) {
        this.isDirty = isDirty;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
