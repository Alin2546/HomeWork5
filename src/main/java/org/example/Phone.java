package org.example;

public abstract class Phone {
    private final int batteryLife;
    private int remainingBatteryLife;
    private String color;
    private String material;
    private String IMEI;
    private String firstContact;
    private String lastContact;
    private String[] firstContactMessages = new String[2];
    private String[] lastContactMessages = new String[2];


    public String getLastContact() {
        System.out.println(lastContact);
        return lastContact;
    }


    public String getFirstContact() {
        System.out.println(firstContact);
        return firstContact;
    }


    public int getRemainingBatteryLife() {
        return remainingBatteryLife;
    }

    public Phone(int batteryLife, String color, String material, String IMEI) {
        this.remainingBatteryLife = batteryLife;
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
    }

    void addContact(String index, String phoneNumber, String firstName, String lastName) {
        if (index.equals("1") && this.firstContact == null) {
            this.firstContact = "Phone number: " + phoneNumber + " First name: " + firstName + " Last name: " + lastName;
        } else if (index.equals("2") && this.lastContact == null) {
            this.lastContact = "Phone number: " + phoneNumber + " First name: " + firstName + " Last name: " + lastName;
        } else {
            System.out.println("Index is to big for phone slots or there are already 2 existing contacts in phone memory");
        }
        if (this.firstContact.equals(this.lastContact)) {
            System.out.println("Please provide separate contacts");
            this.lastContact = null;
        }
    }

    void sendMessage(String phoneNumber, String messageContent) {
        System.out.println(this.firstContact.substring(15,25));
        if (this.remainingBatteryLife <= 0) {
            System.out.println("Phone is out of battery");
            return;
        }
        if (this.firstContact.substring(15, 25).equals(phoneNumber) && this.firstContactMessages[0] == null) {
            this.firstContactMessages[0] = messageContent;
        } else if (this.firstContact.substring(15, 25).equals(phoneNumber) && this.firstContactMessages[1] == null) {
            this.firstContactMessages[1] = messageContent;
        }


        if (messageContent.length() <= 500) {
            System.out.println("Message sent");
            this.remainingBatteryLife--;
        } else {
            System.out.println("Exceeding character limit for a message");
        }
    }

    void getFirstMessage(String phoneNumber) {
        if (this.firstContact.substring(15, 25).equals(phoneNumber)) {
            System.out.println(this.firstContactMessages[0]);
        }
        if (this.lastContact.substring(15, 25).equals(phoneNumber)) {
            System.out.println(this.firstContactMessages[1]);
        }
    }

    void getSecondMessage(String phoneNumber) {
        if (this.firstContact.substring(15, 25).equals(phoneNumber)) {
            System.out.println(this.lastContactMessages[0]);
        }
        if (this.lastContact.substring(15, 25).equals(phoneNumber)) {
            System.out.println(this.lastContactMessages[1]);
        }
    }

    void call(String phoneNumber) {
        if (this.remainingBatteryLife <= 1) {
            System.out.println("Phone is out of battery");
            return;
        }
        this.remainingBatteryLife -= 2;
    }
//    abstract void viewHistory();
}
