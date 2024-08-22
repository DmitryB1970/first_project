package org.javaacademy.core.homework4.ex4.animal;

import org.javaacademy.core.homework4.ex4.exception.AnimalCantAttackException;
import org.javaacademy.core.homework4.ex4.structure.Alive;
import org.javaacademy.core.homework4.ex4.structure.Predator;

public class Tiger extends Predator {

    private boolean agility;

    public Tiger(boolean isAlive, double weight, boolean agility) {
        super(isAlive, weight);
        this.agility = agility;
    }

    @Override
    public void attack(Alive alive) throws AnimalCantAttackException {
        super.attack(alive);
        // реализация в случае ловкости
    }
}
