package org.javaacademy.core.homework4.ex4.animal.predator;

import org.javaacademy.core.homework4.ex4.exception.ActionForDeadAliveException;
import org.javaacademy.core.homework4.ex4.structure.Alive;
import org.javaacademy.core.homework4.ex4.structure.Predator;

public class Tiger extends Predator {

    private static final int TIGER_ATTACK_AGILE_MODIFICATION = 2;
    private boolean agility;

    public Tiger(double weight) {
        super(weight);
    }

    @Override
    public void attack(Alive alive) throws ActionForDeadAliveException {
        super.attack(alive);
    }

    @Override
    protected boolean canAttack(Alive alive) {
        return this.weight * TIGER_ATTACK_AGILE_MODIFICATION < alive.getWeight();
    }
}
