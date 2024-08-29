package org.javaacademy.core.homework5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ComputerSpy extends Computer {

    private Computer computer;


    public ComputerSpy(Computer computer) {
        this.computer = computer;
    }


    public void writeToFile(String text) throws IOException {
        String fileName = "comp.log";
        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(file, true);
    }

    public void readFile(String fileName) {
        File file = new File(getClass().getResource("comp.log").getPath());
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void userEnter(String userName) throws IOException {
        super.userEnter(userName);
        writeToFile("Пользователь " + userName + "вошел");

    }


    @Override
    public void userExit(String userName) throws IOException {
        super.userExit(userName);
        writeToFile("Пользователь " + userName + "вышел");

    }


    @Override
    public void sendMessage(String message) throws IOException {
        writeToFile(message);
        super.sendMessage(message);
    }
}
