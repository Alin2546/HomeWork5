package org.example;
/**
 * The {@code Iphone16Pro} class represents a specific model of iPhone,
 * inheriting from the {@code Iphone} class. This class provides pre-defined
 * attributes such as battery life, color, material, and IMEI for the iPhone 16 Pro model.
 */

public class Iphone16Pro extends Iphone{
    /**
     * Constructs a new {@code Iphone16Pro} instance with pre-defined attributes:
     * <ul>
     *     <li>Battery Life: 98 hours</li>
     *     <li>Color: Infinity Blue</li>
     *     <li>Material: Tungsten --> clearly not a material used for a phone casing </li>
     *     <li>IMEI: 084221134532</li>
     * </ul>
     */
    public Iphone16Pro() {
        super(98, "Infinity Blue", "Tungsten", "084221134532");
    }
}
