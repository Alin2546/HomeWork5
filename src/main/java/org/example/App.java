package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Phone phone1 = new SamsungGalaxyS24Ultra();
        phone1.call("0429942942");
        phone1.call("32932932");
        phone1.sendMessage("3923932", "Hello sunt alin hai asa");
        phone1.sendMessage("3923932", "Hello sunt alin hai asa");
        phone1.sendMessage("3923932", "Hello sunt alin hai asa");
        phone1.sendMessage("3923932", "Hello sunt alin hai asa");
        phone1.sendMessage("3923932", "Hello sunt alin hai asa");
        System.out.println(phone1.getRemainingBatteryLife());
        phone1.addContact("1", "0751777343", "Anghel", "Alin");
        phone1.addContact("2", "0748568747", "Daniliuc", "Alejandra");



        phone1.getFirstContact();
        phone1.getLastContact();

    }
}
