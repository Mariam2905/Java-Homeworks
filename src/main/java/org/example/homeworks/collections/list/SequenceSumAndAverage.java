package org.example.homeworks.collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SequenceSumAndAverage {
    public static void main(String[] args) {
        /**
         * This program reads from the console a sequence of positive integer numbers.
         * Calculates and prints the sum and average of the elements of a sequence.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sequence = new ArrayList<>();
        System.out.println("Enter a positive number if you want to continue, and a blank character if you want to stop, and to count the sum of the numbers entered up to that point.");
        String line = sc.nextLine();
        while (!line.isEmpty()) {
            int number = Integer.parseInt(line);
            if (number > 0) {
                sequence.add(number);
            } else {
                throw new IllegalArgumentException("The number must  be positive.");
            }
            line = sc.nextLine();
        }
        if (sequence.size() > 0) {
            int sum = 0;
            for (int item : sequence) {
                sum += item;
            }
            double average = (double) sum / sequence.size();
            System.out.println("Sum the sequence is: " + sum);
            System.out.println("Average the sequence is: " + average);
        } else {
            throw new NumberFormatException("No input number.");
        }
    }
}
