package org.javaacademy.core.homework4.ex3;

public class Builder implements Soundable{

    @Override
    public void makeSound() {
        System.out.println("Я строитель");
        Human human = new Human();
        human.makeSound();

    }
}
