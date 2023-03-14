package homeworks.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRoot {
    /**
     * 5. Write a program that reads an integer number and calculates and prints its square root.
     * If the number is  invalid or negative, print "Invalid number".
     * In all  cases finally print "Good bye.". Use try-catch-finally.
     * <p>
     * This method print the square root of an integer number.
     *
     * @return result;
     */
    double squareRoot() {
        double result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        double number = sc.nextInt();
        try {
            if (number < 0) throw new InputMismatchException();
            result = Math.sqrt(number);
            System.out.println("The square root of " + number + " is equal to " + result);
        } catch (InputMismatchException e) {
            System.out.println("It is a negative number.");
        } finally {
            System.out.println("Good bye.");
        }
        return result;
    }


    public static void main(String[] args) {
        SquareRoot obj = new SquareRoot();
        System.out.println(obj.squareRoot());
    }
}
