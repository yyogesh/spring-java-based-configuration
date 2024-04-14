package org.example;

public class SmsNotification implements Message{
    @Override
    public void sendMessage() {
        System.out.println("SMS Message send...");
    }
}

