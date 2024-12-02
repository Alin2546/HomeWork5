package org.example;
/**
 * The {@code SamsungGalaxyS24Ultra} class represents a specific model of Samsung,
 * inheriting from the {@code Samsung} class. This class provides pre-defined
 * attributes such as battery life, color, material, and IMEI for the Samsung Galaxy S24 Ultra model.
 */
public class SamsungGalaxyS24Ultra extends Samsung {
    /**
     * Constructs a new {@code SamsungGalaxy6} instance with pre-defined attributes:
     * <ul>
     *     <li>Battery Life: 70 hours</li>
     *     <li>Color: Red Magenta</li>
     *     <li>Material: Glass and metal</li>
     *     <li>IMEI: 0842842813231</li>
     * </ul>
     */
    public SamsungGalaxyS24Ultra() {
        super(70, "Red Magenta", "Glass and metal", "0842842813231");
    }
}
