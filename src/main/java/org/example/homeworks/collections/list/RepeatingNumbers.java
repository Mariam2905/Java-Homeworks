package org.example.homeworks.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepeatingNumbers {
    public static void main(String[] args) {
        /**
         * This method removes from given sequence all numbers that occur odd number of times.
         * Example: {4, 2, 2, 5, 2, 3, 2, 3, 1, 5, 2} -> {5, 3, 3, 5}
         */
        ArrayList<Integer> sequence = new ArrayList<>(List.of(4, 2, 2, 5, 2, 3, 2, 3, 1, 5, 2));
        ArrayList<Integer> finalSequence = new ArrayList<>();
        for (int i = 0; i < sequence.size(); i++) {
            if (Collections.frequency(sequence, sequence.get(i)) % 2 == 0) {
                finalSequence.add(sequence.get(i));
            }
        }
        System.out.println(finalSequence);
    }
}
