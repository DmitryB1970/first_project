package org.javaacademy.core.homework5.ex2;

import java.io.FileWriter;
import java.io.IOException;

public class ComputerSpy extends Computer {

    private final static String FILE_NAME = "comp.log";
    private Computer computer;


    public ComputerSpy(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void login(String userName) {
        writeToLog("Пользователь %s вошел".formatted(userName));
        computer.login(userName);
    }

    @Override
    public void logout() {
        writeToLog("Пользователь вышел");
        computer.logout();
    }

    @Override
    public void sendMessage(String text) {
        writeToLog("Пользователь %s отправил сообщение %s".formatted(computer.getUserName(), text));
        computer.sendMessage(text);
    }

    private void writeToLog(String text) {
        try (FileWriter fileWriter = new FileWriter(FILE_NAME, true);) {
            fileWriter.write(text + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
