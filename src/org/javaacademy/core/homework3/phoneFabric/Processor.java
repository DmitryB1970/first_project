package org.javaacademy.core.homework3.phoneFabric;

public class Processor {

    private int calculationsPerSecond;

    public Processor(int calculationsPerSecond) {
        this.calculationsPerSecond = calculationsPerSecond;
    }

    public int getCalculationsPerSecond() {
        return calculationsPerSecond;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Processor{");
        sb.append("calculationsPerSecond=").append(calculationsPerSecond);
        sb.append('}');
        return sb.toString();
    }
}
