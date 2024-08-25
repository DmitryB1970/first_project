package org.javaacademy.core.homework3.phonefabric.component;

public class Camera {

    private int megaPixel;

    public Camera(int megaPixel) {
        this.megaPixel = megaPixel;
    }

    public void makePhoto() {
        System.out.println("Сделано фото");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Camera{");
        sb.append("megaPixel=").append(megaPixel);
        sb.append('}');
        return sb.toString();
    }
}
