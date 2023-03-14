package homeworks.enum_homeworks.enum2.exercise_2;

public class PrintSize {
    CoffeeSize size;

    public PrintSize(CoffeeSize size) {
        this.size = size;
    }

    /**
     * This method print the name and ordinal value of each size the cooffe.
     */
    public void placeOrder() {
        switch (size) {
            case SMALL:
                System.out.println("This coffee should be small.");
                break;
            case MEDIUM:
                System.out.println("This coffee should be MEDIUM.");
                break;
            case LARGE:
                System.out.println("This coffee should be LARGE.");
                break;
        }
    }
}

