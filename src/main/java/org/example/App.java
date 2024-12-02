package org.example;

/**
 * The main entry point of the application. Demonstrates the use of
 * the SamsungGalaxy6 phone class, including adding contacts,
 * sending messages, making calls, and viewing message history.
 */
public class App {
    /**
     * @param args Command line arguments.
     */

    public static void main(String[] args) {
        // Uncommenting the following line will result in a compilation error
        // because the Samsung class is abstract and cannot be instantiated.
        // Phone phone = new Samsung(); shouldn't compile

        // Create a new instance of SamsungGalaxy6
        Phone phone = new SamsungGalaxy6();

        // Add contacts to the phone
        phone.addContact("1", "0751777343", "Anghel", "Alin");
        phone.addContact("2", "0786723723", "Ionel", "Daniel");

        // Retrieve and display the first and last contact
        phone.getFirstContact();
        phone.getLastContact();

        // send a message to the first contact from the previously listed
        // max number of characters - 100

        phone.sendMessage("0751777343", "message content1");
        phone.sendMessage("0751777343", "message content2");

        // Retrieve and display the first and second messages sent to the first contact
        phone.getFirstMessage("0751777343");
        phone.getSecondMessage("0751777343");

        // make a call to the first contact and some random numbers

        phone.call("0751777343");
        phone.call("0723123123");
        phone.call("0786712223");
        phone.call("0722523420");

        phone.viewHistory();
    }
}
