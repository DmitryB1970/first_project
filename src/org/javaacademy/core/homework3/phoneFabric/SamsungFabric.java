package org.javaacademy.core.homework3.phoneFabric;

public class SamsungFabric {

    public static Samsung createSamsung() {
        return new Samsung(new Camera(16), new Processor(1500),
                new PhoneCase(60, 200, 15));
    }
}
