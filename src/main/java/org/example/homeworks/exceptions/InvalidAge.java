package org.example.homeworks.exceptions;

import java.util.Scanner;

public class InvalidAge {

    /**
     * 7. Write a program that prompts the user to enter their age.
     * If the user enters an age that is negative or greater than 120,
     * the program should throw an exception and print an error message.
     *
     * @throws Exception;
     */
    void invalidAge() {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        try {
            if (age <= 0 || age >= 120) {
                throw new IllegalArgumentException("Age must be not negative or greater than 120.");
            }
            System.out.println("You are " + age + " years old.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        InvalidAge obj = new InvalidAge();
        obj.invalidAge();
    }
}
