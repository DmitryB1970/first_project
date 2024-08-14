package org.javaacademy.core.homework3.phoneFabric;

public class Iphone extends Phone {

    private Processor processor2;

    public Iphone(Camera camera, Processor processor, PhoneCase phoneCase, Processor processor2) {
        super(camera, processor, phoneCase);
        this.processor2 = processor2;
    }

    @Override
    public void makePhoto(Camera camera) {
        super.makePhoto(camera);
    }

    public void processorInfo(Processor processor, Processor processor2) {
        System.out.println(processor.getCalculationsPerSecond());
        System.out.println(processor2.getCalculationsPerSecond());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Iphone{");
        sb.append("camera=").append(camera);
        sb.append(", phoneCase=").append(phoneCase);
        sb.append(", processor=").append(processor);
        sb.append(", processor2=").append(processor2);
        sb.append('}');
        return sb.toString();
    }
}
