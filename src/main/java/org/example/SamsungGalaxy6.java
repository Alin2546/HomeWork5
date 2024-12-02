package org.example;

/**
 * The {@code SamsungGalaxy6} class represents a specific model of Samsung,
 * inheriting from the {@code Samsung} class. This class provides pre-defined
 * attributes such as battery life, color, material, and IMEI for the Samsung Galaxy 6 model.
 */
public class SamsungGalaxy6 extends Samsung {
    /**
     * Constructs a new {@code SamsungGalaxy6} instance with pre-defined attributes:
     * <ul>
     *     <li>Battery Life: 50 hours</li>
     *     <li>Color: Ocean blue</li>
     *     <li>Material: Titanium</li>
     *     <li>IMEI: 08323444221</li>
     * </ul>
     */
    public SamsungGalaxy6() {
        super(50, "Ocean blue", "Titanium", "08323444221");
    }
}
