package org.javaacademy.core.homework4.ex1;

import java.math.BigDecimal;

public class CarWash {

    private final static double LENGTH = 6;
    private final static double HEIGHT = 2.5;
    private final static double WIDTH = 2;

    private static final BigDecimal bigCarRate = BigDecimal.valueOf(4000);
    private static final BigDecimal smallCarRate = BigDecimal.valueOf(2000);

    public TypeOfCar category(Car car) {
        return (car.getLength() > LENGTH || car.getHeight() > HEIGHT || car.getWidth() > WIDTH) ?
                TypeOfCar.BIG_CAR : TypeOfCar.SMALL_CAR;
    }

    public boolean getCleanCar(Car car) {
        return car.isDirty() == false;
    }

    public BigDecimal costOneWashCar(Car car) {
        getCleanCar(car);
        return category(car) == TypeOfCar.BIG_CAR ? bigCarRate : smallCarRate;
    }

    public BigDecimal costForAllWashCars(Car[] cars) {
        BigDecimal totalCost = new BigDecimal(0);
        for (Car car : cars) {
            getCleanCar(car);
            totalCost = category(car) == TypeOfCar.BIG_CAR ?
                    totalCost.add(bigCarRate) : totalCost.add(smallCarRate);
        }
        return totalCost;
    }
}
