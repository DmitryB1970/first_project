package org.javaacademy.core.homework4.ex4.structure;

import org.javaacademy.core.homework4.ex4.exception.ActionForDeadAliveException;

/**
 * Травоядное
 */
public abstract class Herbivore extends Alive {

    public Herbivore(double weight) {
        super(weight);
    }

    protected void checkCanRun() {
        if (this.isDead) {
            throw new ActionForDeadAliveException();
        }
    }

    public abstract void run();
}
