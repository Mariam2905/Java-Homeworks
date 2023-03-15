package org.example.homeworks.exceptions;

import java.util.Scanner;

public class Quotient {
    /**
     * 9. Write a program that reads two integers from the user and calculates their quotient.
     * If the second integer is 0 or negative,
     * the program should throw an exception and print an error message.
     *
     * @return quotient;
     */
    double quotient() {
        double quotient;
        int number1, number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        number1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        number2 = sc.nextInt();
        try {
            if (number2 <= 0) {
                throw new ArithmeticException("This is en error");
            }
        } finally {
            quotient = number1 / number2;
        }
        return quotient;
    }

    public static void main(String[] args) {
        Quotient obj = new Quotient();
        System.out.println(obj.quotient());
    }
}
