package org.javaacademy.core.homework5;

import java.io.IOException;

public class Computer {

    private User user;

    public void userEnter(String userName) throws IOException {
        user.userName = userName;

    }

    public void userExit(String userName) throws IOException {
        user.userName = null;
    }

    public void sendMessage(String message) throws IOException {
        System.out.println(message);
    }

    public static class User {

        private String userName;

        public User(String userName) {
            this.userName = userName;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }
}
