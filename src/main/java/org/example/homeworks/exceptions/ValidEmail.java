package org.example.homeworks.exceptions;

import java.util.Scanner;

public class ValidEmail {
    /**
     * 8. Write a program that reads a string from the user and checks if it is a valid email address.
     * If the string is not a valid email address, the program should throw an exception
     * and print an error message.
     * <p>
     * This method checks if it is a valid email.
     */

    void validEmail() {
        String email;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an email address: ");
        email = sc.nextLine();
        try {
            if (!(email.contains("@gmail.com"))) {
                throw new Exception();
            }
            System.out.println("You are entered this email address: " + email);
        } catch (Exception e) {
            System.out.println("It is not a valid email address.");
        }
    }

    public static void main(String[] args) {
        ValidEmail email = new ValidEmail();
        email.validEmail();
    }
}
