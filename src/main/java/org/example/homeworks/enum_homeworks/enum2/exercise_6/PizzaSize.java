package org.example.homeworks.enum_homeworks.enum2.exercise_6;

public enum PizzaSize {
    SMALL(100),
    MEDIUM(150),
    LARGE(200);

    private int price;

    PizzaSize(int price) {
        this.price = price;
    }

    /**
     * This method returns a price the each member in the enum.
     *
     * @return price;
     */
    public int getPrice() {
        return price;
    }

    /**
     * This method sets a price the each member in the enum.
     *
     * @return price;
     */
    public void setPrice(int price) {
        this.price = price;
    }
}
