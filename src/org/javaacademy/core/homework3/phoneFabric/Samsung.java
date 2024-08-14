package org.javaacademy.core.homework3.phoneFabric;

public class Samsung extends Phone {

    public Samsung(Camera camera, Processor processor, PhoneCase phoneCase) {
        super(camera, processor, phoneCase);
    }

    @Override
    public void makePhoto(Camera camera) {
        super.makePhoto(camera);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Samsung{");
        sb.append("camera=").append(camera);
        sb.append(", phoneCase=").append(phoneCase);
        sb.append(", processor=").append(processor);
        sb.append('}');
        return sb.toString();
    }
}
