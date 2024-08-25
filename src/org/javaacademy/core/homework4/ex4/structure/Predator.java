package org.javaacademy.core.homework4.ex4.structure;

import org.javaacademy.core.homework4.ex4.exception.ActionForDeadAliveException;

public abstract class Predator extends Alive {

    private static final int COEFFICIENT_WEIGHT_FOR_EAT = 3;

    public Predator(double weight) {
        super(weight);
    }

    public void attack(Alive alive) throws ActionForDeadAliveException {
        if (this.isDead) {
            throw new ActionForDeadAliveException();
        }
        if (this.weight < alive.getWeight()) {
            this.dead();
        } else {
            alive.dead();
            this.weight = weight + alive.getWeight() / COEFFICIENT_WEIGHT_FOR_EAT;
        }
    }

    protected boolean canAttack(Alive alive) {
        return this.weight < alive.getWeight();
    }
}
