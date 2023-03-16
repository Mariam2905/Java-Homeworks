package org.example.homeworks.algorithms.algorithmic_exercises;

public class PrimeFactor {
    /**
     * This method calculates the largest prime factor of a given number.
     *
     * @param number;
     * @return largestFactor;
     */
    int theLargestPrimeFactor(int number) {
        int i;
        int largestFactor = 1;
        for (i = 2; i <= number / i; i++) {
            while (number % i == 0) {
                largestFactor = i;
                number /= i;
            }
        }
        if (number > largestFactor) {
            largestFactor = number;
        }
        return largestFactor;
    }

    public static void main(String[] args) {
        PrimeFactor obj = new PrimeFactor();
        System.out.println(obj.theLargestPrimeFactor(455));
    }
}
