package org.example.homeworks.algorithms.algorithmic_exercises;

public class PairAndOdd {

    /**
     * This method generates a random number and prints whether it is odd or even․
     *
     * @return random,
     */
    int pairAndOdd() {
        int min = 1;
        int max = 100;
        int random = (int) (Math.random() * (max + min));
        if (random % 2 == 0) {
            System.out.println("The number " + random + " is even.");
        } else {
            System.out.println("The number " + random + " is odd.");
        }
        return random;
    }

    public static void main(String[] args) {
        PairAndOdd obj = new PairAndOdd();
        obj.pairAndOdd();
    }
}
