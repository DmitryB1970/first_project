package org.javaacademy.core.homework4.ex3;

public class Driver extends Human implements Soundable{

    @Override
    public void makeSound() {
        System.out.println("Я водитель");
    }

}
