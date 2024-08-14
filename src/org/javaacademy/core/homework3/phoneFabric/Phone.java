package org.javaacademy.core.homework3.phoneFabric;

public abstract class Phone {

    protected Camera camera;
    protected Processor processor;
    protected PhoneCase phoneCase;

    public Phone(Camera camera, Processor processor, PhoneCase phoneCase) {
        this.camera = camera;
        this.processor = processor;
        this.phoneCase = phoneCase;
    }

    public void makePhoto(Camera camera) {
        System.out.println("Сделано фото");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Phone{");
        sb.append("camera=").append(camera);
        sb.append(", processor=").append(processor);
        sb.append(", phoneCase=").append(phoneCase);
        sb.append('}');
        return sb.toString();
    }
}
