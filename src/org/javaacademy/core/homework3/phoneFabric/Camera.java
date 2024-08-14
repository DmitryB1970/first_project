package org.javaacademy.core.homework3.phoneFabric;

public class Camera {

    private int megaPixel;

    public Camera(int megaPixel) {
        this.megaPixel = megaPixel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Camera{");
        sb.append("megaPixel=").append(megaPixel);
        sb.append('}');
        return sb.toString();
    }
}
