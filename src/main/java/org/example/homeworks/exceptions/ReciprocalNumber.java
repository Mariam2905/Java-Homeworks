package org.example.homeworks.exceptions;

public class ReciprocalNumber {
    /**
     * 1. This program reads an integer from the user and prints its reciprocal.
     * If the user enters 0, the program should throw an exception and print an error message.
     *
     * @param number;
     * @return 1/number;
     */

    double reciprocalNumber(int number) {
        if (number == 0) {
            throw new ArithmeticException("You can't divided by zero.");
        }
        return (double) 1 / number;
    }

    public static void main(String[] args) {
        ReciprocalNumber obj = new ReciprocalNumber();
        System.out.println(obj.reciprocalNumber(-4));
    }
}
