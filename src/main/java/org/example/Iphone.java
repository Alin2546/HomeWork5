package org.example;

/**
 * The {@code Iphone} class represents a specific type of phone inheriting from the {@code Phone} class.
 * It provides basic attributes such as battery life, color, material, and IMEI.
 *
 * <p>This class currently does not add additional functionality beyond the {@code Phone} class.</p>
 *
 * @see Phone
 */
public class Iphone extends Phone {
    /**
     * Constructs a new {@code Iphone} instance with the specified attributes.
     *
     * @param batteryLife the total battery life of the iPhone in hours
     * @param color       the color of the iPhone
     * @param material    the material of the iPhone
     * @param IMEI        the unique IMEI identifier of the iPhone
     */
    public Iphone(int batteryLife, String color, String material, String IMEI) {
        super(batteryLife, color, material, IMEI);
    }
}
