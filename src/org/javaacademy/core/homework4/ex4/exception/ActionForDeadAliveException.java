package org.javaacademy.core.homework4.ex4.exception;

public class ActionForDeadAliveException extends RuntimeException {

    public ActionForDeadAliveException() {
        super("Животное мертво и не может нападать");
    }
}
