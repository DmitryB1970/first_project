package org.javaacademy.core.homework4.ex2;

public class Airplane implements Flyable {

    private int countPassenger;

    public Airplane(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassenger < 0) {
            throw new FlyException("Пассажиров меньше 0. Полёт невозможен.");
        }
        System.out.println("Самолёт летит");
    }
}
