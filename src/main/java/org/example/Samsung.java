package org.example;
/**
 * The {@code Samsung} class represents a specific type of phone inheriting from the {@code Phone} class.
 * It provides basic attributes such as battery life, color, material, and IMEI.
 *
 * <p>This class currently does not add additional functionality beyond the {@code Phone} class.</p>
 *
 * @see Phone
 */
public abstract class Samsung extends Phone {/**
 * Constructs a new {@code Samsung} instance with the specified attributes.
 *
 * @param batteryLife the total battery life of the Samsung in hours
 * @param color the color of the Samsung
 * @param material the material of the Samsung
 * @param IMEI the unique IMEI identifier of the Samsung
 */

    public Samsung(int batteryLife, String color, String material, String IMEI) {
        super(batteryLife, color, material, IMEI);
    }
}
