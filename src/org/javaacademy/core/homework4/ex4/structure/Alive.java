package org.javaacademy.core.homework4.ex4.structure;

public abstract class Alive {

    protected boolean isDead = false;
    protected double weight;

    public Alive(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void dead() {
        this.isDead = true;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
