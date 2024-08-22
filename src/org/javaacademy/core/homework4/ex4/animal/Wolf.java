package org.javaacademy.core.homework4.ex4.animal;

import org.javaacademy.core.homework4.ex4.exception.AnimalCantAttackException;
import org.javaacademy.core.homework4.ex4.structure.Alive;
import org.javaacademy.core.homework4.ex4.structure.Predator;

public class Wolf extends Predator {

    public Wolf(boolean isAlive, double weight) {
        super(isAlive, weight);
    }

    @Override
    public void attack(Alive alive) throws AnimalCantAttackException {
        super.attack(alive);
    }
}
