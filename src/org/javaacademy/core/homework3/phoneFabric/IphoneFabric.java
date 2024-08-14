package org.javaacademy.core.homework3.phoneFabric;

public class IphoneFabric {

    public static Iphone createIphone() {

        return new Iphone(new Camera(8), new Processor(1000),
                new PhoneCase(60, 200, 10), new Processor(1000));
    }
}
