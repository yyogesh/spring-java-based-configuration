package org.example;

public class Notification {
    private String name;
    private int id;
    Message message;

    public Notification() {
        System.out.println("Notification object crated");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void sendNotification() {
        message.sendMessage();
        // System.out.println("Send notification method called..");
    }
}
