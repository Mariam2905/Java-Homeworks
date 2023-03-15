package org.example.homeworks.exceptions;

public class DivisionByZero {
    /**
     * 3. Write a program that reads two numbers from the user and divides them.
     * If the user enters 0 as the second number, the program should throw an exception
     * and print an error message.
     * <p>
     * <p>
     * This method divide two numbers.
     *
     * @param number1
     * @param number2
     * @return result;
     */
    double division(double number1, double number2) {
        double result = 0.0;
        try {
            if (number2 == 0) {
                throw new ArithmeticException("You can't divide by zero.");
            }
        } finally {
            result = number1 / number2;
        }
        return result;
    }

    public static void main(String[] args) {
        DivisionByZero object = new DivisionByZero();
        System.out.println(object.division(1, 3));
    }
}
