package org.javaacademy.core.homework4.ex4.animal.herbivore;

import org.javaacademy.core.homework4.ex4.structure.Herbivore;

public class Rabbit extends Herbivore {

    public Rabbit(double weight) {
        super(weight);
    }

    @Override
    public void run() {
        checkCanRun();
        System.out.println("Кролик быстро бежит");
    }
}
