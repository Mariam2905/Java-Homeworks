package org.example.homeworks.collections;

import java.util.LinkedList;
import java.util.List;

public class WithoutNegativeNumbers {
    public static void main(String[] args) {
        /**
         * This method removes from given sequence all negative numbers.
         */
        LinkedList<Integer> sequence = new LinkedList<>(List.of(24, 0, 7, 145, 2023, 5, 0, -74, 0, -123));
        LinkedList<Integer> finalList = new LinkedList<>();
        for (int i = 0; i < sequence.size(); i++) {
            if (sequence.get(i) >= 0) {
                finalList.add(sequence.get(i));
            }
        }
        System.out.println(finalList);

//        for (int i = 0; i < sequence.size(); i++) {
//            if (sequence.get(i) <= 0) {
//                sequence.remove(i);
//                i--;
//            }
//        }
//        System.out.println(sequence);
    }
}
