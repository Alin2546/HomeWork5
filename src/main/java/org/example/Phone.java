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
        if (this.batteryLife <= 0) {
            System.out.println("Phone is out of battery");
            return;
        }
        if (messageContent.length() <= 500) {
            System.out.println("Message sent");
            this.remainingBatteryLife--;
        } else {
            System.out.println("Exceeding character limit for a message");
        }
    }

    //    abstract void getFirstMessage();
//    abstract void getSecondMessage();
    void call(String phoneNumber) {
        this.remainingBatteryLife -= 2;
    }
//    abstract void viewHistory();
}
