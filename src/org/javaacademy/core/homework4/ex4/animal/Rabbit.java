package org.javaacademy.core.homework4.ex4.animal;

import org.javaacademy.core.homework4.ex4.exception.AnimalCantRunException;
import org.javaacademy.core.homework4.ex4.structure.Herbivore;

public class Rabbit extends Herbivore {

    public Rabbit(boolean isAlive, double weight) {
        super(isAlive, weight);
    }

    @Override
    public void run() throws AnimalCantRunException {
        super.run();
        System.out.println("Кролик быстро бежит");
    }
}
