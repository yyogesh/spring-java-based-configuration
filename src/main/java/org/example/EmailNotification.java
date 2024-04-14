package org.example;

public class EmailNotification implements Message{
    @Override
    public void sendMessage() {
        System.out.println("Email Message send...");
    }
}
