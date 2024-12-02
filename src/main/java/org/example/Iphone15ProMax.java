package org.example;

/**
 * The {@code Iphone15ProMax} class represents a specific model of iPhone,
 * inheriting from the {@code Iphone} class. This class provides pre-defined
 * attributes such as battery life, color, material, and IMEI for the iPhone 15 Pro Max model.
 */


public class Iphone15ProMax extends Iphone {
    /**
     * Constructs a new {@code Iphone15ProMax} instance with pre-defined attributes:
     * <ul>
     *     <li>Battery Life: 90 hours</li>
     *     <li>Color: Flower Purple</li>
     *     <li>Material: Adamantium --> a fictional alloy from comic books </li>
     *     <li>IMEI: 083214771134</li>
     * </ul>
     */
    public Iphone15ProMax() {
        super(90, "Flower Purple", "Adamantium", "083214771134");
    }
}
