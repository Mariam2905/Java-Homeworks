package org.example.homeworks.algorithms.algorithmic_exercises;

import java.util.Random;

public class LargestAndSmallestNumber {

    /**
     * This method, using a while loop, finds the largest number
     * among 10 randomly drawn integers between 1 and 100.
     *
     * @return largestNumber;
     */
    int largestNumber() {
        int min = 1;
        int max = 100;
        int largest = 0;
        int quantity = 1;
        while (quantity <= 10) {
            Random r = new Random();
            int randomNumber = min + r.nextInt(max);
            System.out.print(randomNumber + " ");
            if (randomNumber > largest) {
                largest = randomNumber;
            }
            quantity++;
        }
        return largest;
    }

    /**
     * This method, using a while loop, finds the smallest number
     * among 10 randomly drawn integers between 1 and 100.
     *
     * @return smallestNumber;
     */
    int smallestNumber() {
        int min = 1;
        int max = 100;
        int smallest = 100;
        int quantity = 1;
        while (quantity <= 10) {
            Random r = new Random();
            int randomNumber = min + r.nextInt(max);
            System.out.print(randomNumber + " ");
            if (randomNumber < smallest) {
                smallest = randomNumber;
            }
            quantity++;
        }
        return smallest;
    }

    public static void main(String[] args) {
        LargestAndSmallestNumber obj = new LargestAndSmallestNumber();
        System.out.println("The largest number is: " + obj.largestNumber());
        System.out.println("The smallest number is: " + obj.smallestNumber());
    }
}