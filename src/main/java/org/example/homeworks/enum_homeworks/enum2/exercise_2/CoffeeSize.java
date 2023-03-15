package org.example.homeworks.enum_homeworks.enum2.exercise_2;

/**
 * Create an enum called "CoffeeSize" that contains values for small, medium, and large coffee sizes.
 * Write a program that prints the name and ordinal value of each size.
 */
public enum CoffeeSize {
    SMALL, MEDIUM, LARGE;

    /**
     * This method gives a ordinal value the each member in the enum.
     *
     * @return this.ordinal;
     */
    public int getOrdinal() {
        return this.ordinal();
    }

    /**
     * This method gives name the each member in the enum.
     *
     * @return this.name;
     */
    public String getName() {
        return this.name();
    }
}
