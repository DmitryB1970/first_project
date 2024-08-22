package org.javaacademy.core.homework4.ex1;

public class Car {

    private boolean isDirty;
    private double width;
    private double height;
    private double length;


    public Car(boolean isDirty, double width, double height, double length) {
        this.isDirty = isDirty;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    private final static double LENGTH = 6;
    private final static double HEIGHT = 2.5;
    private final static double WIDTH = 2;

    public TypeOfCar category() {
        return (length > LENGTH || height > HEIGHT || width > WIDTH) ? TypeOfCar.BIG_CAR : TypeOfCar.SMALL_CAR;
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
