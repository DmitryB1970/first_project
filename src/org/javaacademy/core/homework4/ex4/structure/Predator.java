package org.javaacademy.core.homework4.ex4.structure;

import org.javaacademy.core.homework4.ex4.exception.AnimalCantAttackException;

public abstract class Predator extends Alive {

    public Predator(boolean isAlive, double weight) {
        super(isAlive, weight);
    }

    public void attack(Alive alive) throws AnimalCantAttackException {
        if (super.isAlive()) {
            if (alive.getWeight() > super.getWeight()) {
                this.isDead();
                System.out.println(this.getClass().getSimpleName() + " " + this.isAlive());
                System.out.println(alive.getClass().getSimpleName());
            } else {
                super.setWeight(getWeight() * 1.3);
                System.out.println(this.getClass().getSimpleName() + " " + this.getWeight());
            }
        } else {
            throw new AnimalCantAttackException("Животное не может нападать");
        }
    }
}
