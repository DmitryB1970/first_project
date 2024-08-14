package org.javaacademy.core.homework3.phoneFabric;

public class TwoPhonesFabric {

    public static final Iphone IPHONE = IphoneFabric.createIphone();
    public static final Samsung SAMSUNG = SamsungFabric.createSamsung();

    public static void createPhones() {
        System.out.println(IPHONE);
        IPHONE.makePhoto(IPHONE.camera);
        IPHONE.processorInfo(IPHONE.processor, IPHONE.processor);
        System.out.println(SAMSUNG);
        SAMSUNG.makePhoto(SAMSUNG.camera);
    }
}
