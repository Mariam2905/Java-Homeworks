package homeworks.enum_homeworks.enum2.exercise_6;

import homeworks.enum_homeworks.enum2.exercise_5.Seasons;

/**
 * Write a program that prompts the user to choose a pizza size and a number of toppings,
 * and then calculates the price of the pizza based on the size and number of toppings.
 */
public class ChooseAPizza {
    int sum;

    public void priceOfPizza(int chooseSize, int chooseTopping) {
        if (chooseSize == PizzaSize.SMALL.getPrice() && chooseTopping == Toppings.PEPPERONI.getPrice()) {
            sum = PizzaSize.SMALL.getPrice() * Toppings.PEPPERONI.getPrice();
            System.out.println(sum);
        } else if (chooseSize == PizzaSize.SMALL.getPrice() && chooseTopping == Toppings.MUSHROOMS.getPrice()) {
            sum = PizzaSize.SMALL.getPrice() * Toppings.MUSHROOMS.getPrice();
            System.out.println(sum);
        }
    }
}
