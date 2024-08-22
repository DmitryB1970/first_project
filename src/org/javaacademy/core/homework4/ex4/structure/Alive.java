package org.javaacademy.core.homework4.ex4.structure;

public abstract class Alive {

    private boolean isAlive;
    private double weight;

    public Alive(boolean isAlive, double weight) {
        this.isAlive = isAlive;
        this.weight = weight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public double getWeight() {
        return weight;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void isDead() {
        isAlive = false;
    }
}
