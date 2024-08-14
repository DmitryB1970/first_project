package org.javaacademy.core.homework3.phoneFabric;

public class PhoneCase {

    private double width;
    private double height;
    private double length;

    public PhoneCase(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhoneCase{");
        sb.append("height=").append(height);
        sb.append(", width=").append(width);
        sb.append(", length=").append(length);
        sb.append('}');
        return sb.toString();
    }
}
