package org.example;

/**
 * Represents an abstract phone with basic functionalities such as managing contacts, sending messages,
 * making calls, and viewing call history. This class is designed to be extended for specific phone types.
 */
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
    private String firstContactPhoneNumber;
    private String secondContactPhoneNumber;
    private String[] phoneCallsHistory = new String[1000];


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

    /**
     * Constructs a new phone with specified attributes.
     *
     * @param batteryLife the total battery life of the phone.
     * @param color       the color of the phone.
     * @param material    the material of the phone.
     * @param IMEI        the IMEI of the phone.
     */
    public Phone(int batteryLife, String color, String material, String IMEI) {
        this.remainingBatteryLife = batteryLife;
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
    }

    /**
     * Adds a contact to the phone.
     *
     * @param index       the contact index ("1" or "2").
     * @param phoneNumber the contact's phone number.
     * @param firstName   the contact's first name.
     * @param lastName    the contact's last name.
     */
    void addContact(String index, String phoneNumber, String firstName, String lastName) {
        // Implementation
        if (index.equals("1") && this.firstContact == null) {
            this.firstContact = "Phone number: " + phoneNumber + " First name: " + firstName + " Last name: " + lastName;
            this.firstContactPhoneNumber = phoneNumber;
        } else if (index.equals("2") && this.lastContact == null) {
            this.lastContact = "Phone number: " + phoneNumber + " First name: " + firstName + " Last name: " + lastName;
            this.secondContactPhoneNumber = phoneNumber;
        } else {
            System.out.println("Index is to big for phone slots or there are already 2 existing contacts in phone memory");
        }
        if (this.firstContact.equals(this.lastContact)) {
            System.out.println("Please provide separate contacts");
            this.lastContact = null;
        }
    }

    /**
     * Sends a message to a specific contact.
     *
     * @param phoneNumber    the recipient's phone number.
     * @param messageContent the content of the message.
     */
    void sendMessage(String phoneNumber, String messageContent) {

//             Checking for edge cases like:
//             battery is dead,
//             phone number is not in contacts,
//             message length is too long to be sent.


        if (this.remainingBatteryLife <= 0) {
            System.out.println("Phone is out of battery");
        } else if (!(this.firstContactPhoneNumber.equals(phoneNumber)) && (!this.secondContactPhoneNumber.equals(phoneNumber))) {
            System.out.println("The phone number: " + phoneNumber + " is not in contacts");
            return;
        } else if (messageContent.length() <= 500) {
            this.remainingBatteryLife--;
        } else {
            System.out.println("Exceeding character limit for a message");
            return;
        }

        // Implementation
        if (this.firstContactPhoneNumber.equals(phoneNumber) && this.firstContactMessages[0] == null) {
            this.firstContactMessages[0] = messageContent;
        } else if (this.firstContactPhoneNumber.equals(phoneNumber) && this.firstContactMessages[1] == null) {
            this.firstContactMessages[1] = messageContent;
        } else if (this.secondContactPhoneNumber.equals(phoneNumber) && this.lastContactMessages[0] == null) {
            this.firstContactMessages[0] = messageContent;
        } else if (this.secondContactPhoneNumber.equals(phoneNumber) && this.lastContactMessages[1] == null) {
            this.firstContactMessages[1] = messageContent;
        } else {
            System.out.println("Reached messages sent limit on this phone number: " + phoneNumber + "\n" + "Please buy another phone");
            return;
        }
        System.out.println("Message sent");
    }

    /**
     * Retrieves the first message sent to a specific phone number.
     *
     * @param phoneNumber the phone number.
     */
    void getFirstMessage(String phoneNumber) {
        // Checking edge case when {@code phoneNumber} is not in contacts
        if (!(this.firstContactPhoneNumber.equals(phoneNumber)) && (!this.secondContactPhoneNumber.equals(phoneNumber))) {
            System.out.println("The phone number: " + phoneNumber + " is not in contacts");
            return;
        }

        // Implementation
        if (phoneNumber.equals(this.firstContactPhoneNumber) && this.firstContactMessages[0] != null) {
            System.out.println(this.firstContactMessages[0]);
        } else if (phoneNumber.equals(this.secondContactPhoneNumber) && this.lastContactMessages[0] != null) {
            System.out.println(this.lastContactMessages[0]);
        } else {
            System.out.println("Phone number: " + phoneNumber + " has not sent any messages yet!");
        }
    }

    /**
     * Retrieves the second message sent to a specific phone number.
     *
     * @param phoneNumber the phone number.
     */
    void getSecondMessage(String phoneNumber) {
        // Checking edge case when {@code phoneNumber} is not in contacts
        if (!(this.firstContactPhoneNumber.equals(phoneNumber)) && (!this.secondContactPhoneNumber.equals(phoneNumber))) {
            System.out.println("The phone number: " + phoneNumber + " is not in contacts");
            return;
        }
        // Implementation
        if (phoneNumber.equals(this.firstContactPhoneNumber) && this.firstContactMessages[1] != null) {
            System.out.println(this.firstContactMessages[1]);
        } else if (phoneNumber.equals(this.secondContactPhoneNumber) && this.lastContactMessages[1] != null) {
            System.out.println(this.lastContactMessages[1]);
        } else {
            System.out.println("Phone number: " + phoneNumber + " has not sent any messages yet!");
        }
    }

    /**
     * Makes a call to a specific phone number.
     *
     * @param phoneNumber the phone number to call.
     */
    void call(String phoneNumber) {
        if (this.remainingBatteryLife <= 1) {
            System.out.println("Phone is out of battery");
            return;
        }
        this.remainingBatteryLife -= 2;
        for (int i = 0; i < this.phoneCallsHistory.length; ++i) {
            if (this.phoneCallsHistory[i] == null) {
                this.phoneCallsHistory[i] = phoneNumber;
                return;
            }
        }
    }

    /**
     * Views the phone's call history.
     */
    void viewHistory() {
        if (this.remainingBatteryLife == 0) {
            System.out.println("Phone is out of battery, cannot see history" + "\n" + "Please charge the phone");
            return;
        }
        for (String s : this.phoneCallsHistory) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}
