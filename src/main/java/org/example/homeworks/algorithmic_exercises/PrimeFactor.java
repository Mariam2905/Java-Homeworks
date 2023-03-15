package org.example.homeworks.algorithmic_exercises;

public class PrimeFactor {
    public static void main(String[] args) {
        theLargestPrimeFactor(455);
    }

    public static int theLargestPrimeFactor(int number) {
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        continue;
                    }
                    System.out.println(i);
                    return i;
                }
            }
        }
        return 0;
    }
}
