package org.example.homeworks.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IncreasingOrder {
    public static void main(String[] args) {
        /**
         * This method gives a sequence of integers (ArrayList<int>) and sorts them in an increasing order.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sequence = new ArrayList<>();
        System.out.println("Enter a number if you want to continue, and a blank character if you want to stop.");
        String line = sc.nextLine();
        while (!line.isEmpty()) {
            int number = Integer.parseInt(line);
            sequence.add(number);
            line = sc.nextLine();
        }
        if (sequence.isEmpty()) {
            throw new IllegalArgumentException("Sequence is empty: ");
        }
        Collections.sort(sequence);
        System.out.println(sequence);
    }
}
