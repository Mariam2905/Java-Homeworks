package homeworks.enum_homeworks.enum2.exercise_6;

public enum Toppings {
    PEPPERONI(20),
    MUSHROOMS(30),
    ONIONS(15),
    SAUSAGE(25),
    CORN(21);

    private int price;

    Toppings(int price) {
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
