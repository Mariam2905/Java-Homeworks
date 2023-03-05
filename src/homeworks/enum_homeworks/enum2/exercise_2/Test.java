package homeworks.enum_homeworks.enum2.exercise_2;

public class Test {
    public static void main(String[] args) {
        PrintSize order = new PrintSize(CoffeeSize.SMALL);
        order.placeOrder();
        PrintSize order1 = new PrintSize(CoffeeSize.MEDIUM);
        order1.placeOrder();
        PrintSize order2 = new PrintSize(CoffeeSize.LARGE);
        order2.placeOrder();

        CoffeeSize sizes = CoffeeSize.SMALL;
        System.out.print(sizes.getName());
        System.out.println(" - " + sizes.getOrdinal());
        CoffeeSize sizes1 = CoffeeSize.MEDIUM;
        System.out.print(sizes1.getName());
        System.out.println(" - " + sizes1.getOrdinal());
        CoffeeSize sizes2 = CoffeeSize.LARGE;
        System.out.print(sizes2.getName());
        System.out.println(" - " + sizes2.getOrdinal());
    }
}
