package org.javaacademy.core.homework4.ex4.structure;

import org.javaacademy.core.homework4.ex4.exception.AnimalCantRunException;

public abstract class Herbivore extends Alive {

    public Herbivore(boolean isAlive, double weight) {
        super(isAlive, weight);
    }

    public void run() throws AnimalCantRunException {
        if (!isAlive()) {
            throw new AnimalCantRunException("Животное не может бегать");
        }
    }
}
