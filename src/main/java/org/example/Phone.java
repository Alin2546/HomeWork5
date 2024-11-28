package org.example;

public abstract class Phone {
    private final int batteryLife;
    private String color;
    private String material;
    private String IMEI;

    public Phone(int batteryLife, String color, String material, String IMEI) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
    }

//    abstract void addContact(String index, String phoneNumber, String firstName, String lastName);
//    abstract void getFirstContact();
//    abstract void getLastContact();
//    abstract void sendMessage(String phoneNumber, String messageContent);
//    abstract void getFirstMessage();
//    abstract void getSecondMessage();
//    abstract void call(String phoneNumber);
//    abstract void viewHistory();
}
