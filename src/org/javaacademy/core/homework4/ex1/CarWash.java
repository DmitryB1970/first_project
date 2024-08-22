package org.javaacademy.core.homework4.ex1;

import java.math.BigDecimal;

public class CarWash {

    private Car car;
    private static final BigDecimal bigCarRate = BigDecimal.valueOf(4000);
    private static final BigDecimal smallCarRate = BigDecimal.valueOf(2000);

    public boolean getCleanCar(Car car) {
        return car.isDirty() == false;
    }

    public BigDecimal costOneWashCar(Car car) {
        getCleanCar(car);
        return car.category() == TypeOfCar.BIG_CAR ? bigCarRate : smallCarRate;
    }

    public BigDecimal costForAllWashCars(Car car, int countCar) {
        getCleanCar(car);
        return car.category() == TypeOfCar.BIG_CAR ?
            bigCarRate.multiply(BigDecimal.valueOf(countCar)) : smallCarRate.multiply(BigDecimal.valueOf(countCar));
    }
}
