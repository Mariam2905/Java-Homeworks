package org.example.homeworks.exceptions;

import java.util.Scanner;

public class SumOfArray {

    /**
     * 2. Write a program that accepts an array of integers from the user and
     * calculates the sum of its elements.
     * If the user enters a non-integer value, the program should throw an exception
     * and print an error message.
     * <p>
     * This method calculates the sum of elements in array.
     * return sum of the elements
     */

    int sumOfArray() {
        int sum = 0;
        int n;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter the number of elements in array: ");
        n = myScanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Enter a integer number: ");
                array[i] = myScanner.nextInt();
                sum += array[i];
            } catch (Exception e) {
                System.out.println("You are entered a non-integer value.");
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfArray obj = new SumOfArray();
        System.out.println(obj.sumOfArray());
    }

}
