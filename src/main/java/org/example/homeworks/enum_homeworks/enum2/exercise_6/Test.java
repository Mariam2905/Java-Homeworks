package org.example.homeworks.enum_homeworks.enum2.exercise_6;

public class Test {
    public static void main(String[] args) {
        ChooseAPizza order = new ChooseAPizza();
        order.priceOfPizza(PizzaSize.SMALL.getPrice(), Toppings.PEPPERONI.getPrice());
        order.priceOfPizza(PizzaSize.SMALL.getPrice(), Toppings.MUSHROOMS.getPrice());
//        order.priceOfPizza(PizzaSize.MEDIUM.getPrice(), Toppings.CORN.getPrice());
    }
}
