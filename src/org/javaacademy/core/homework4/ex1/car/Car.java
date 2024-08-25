package org.javaacademy.core.homework4.ex1.car;

public abstract class Car {

    protected boolean isClean = true;
    protected double width;
    protected double height;
    protected double length;

    public Car(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Car(boolean isClean, double width, double height, double length) {
        this.isClean = isClean;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public boolean isClean() {
        return isClean;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
