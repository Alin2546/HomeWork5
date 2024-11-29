package org.example;

public abstract class Phone {
    private final int batteryLife;
    private int remainingBatteryLife;
    private String color;
    private String material;
    private String IMEI;
    private String firstContact;
    private String lastContact;

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

        }
        if (index.equals("2") && this.lastContact == null && this.firstContact != this.lastContact) {
            this.lastContact = "Phone number: " + phoneNumber + " First name: " + firstName + " Last name: " + lastName;
        }

    }

    //    abstract void getFirstContact();
//    abstract void getLastContact();
    void sendMessage(String phoneNumber, String messageContent) {
        if (messageContent.length() <= 500) {

        }
        this.remainingBatteryLife--;
    }

    //    abstract void getFirstMessage();
//    abstract void getSecondMessage();
    void call(String phoneNumber) {
        this.remainingBatteryLife -= 2;
    }
//    abstract void viewHistory();
}
