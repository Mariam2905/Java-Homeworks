package homeworks.algorithmic_exercises;

import java.util.Random;

public class PairAndOdd {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int random = (int) (Math.random() * (max + min));
        if (random % 2 == 0) {
            System.out.println("The number " + random + " is even");
        } else {
            System.out.println("The number " + random + " is odd");
        }
    }
}
