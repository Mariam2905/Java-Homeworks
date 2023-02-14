package homeworks.algorithmic_exercises;

import java.util.Random;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int largest = 0;
        int smallest = 100;
        int quantity = 1;
        while (quantity <= 10) {
            Random r = new Random();
            int randomNumber = min + r.nextInt(max);
            System.out.print(randomNumber + " ");
            if (randomNumber > largest) {
                largest = randomNumber;
            }
            if (randomNumber < smallest) {
                smallest = randomNumber;
            }
            quantity++;
        }
        System.out.println();
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }
}

//    public static int randomNumber() {
//        int min = 1;
//        int max = 100;
//        int random = (int) (Math.random() * (max + min));
//        System.out.print(random + " ");
//        return 0;
//    }
//
//    public static void number() {
//        int quantity = 1;
//        while (quantity <= 10) {
//            quantity++;
//            randomNumber();
//        }
//    }
//
//    public static void largestAndSmallestNumber(){
//        number();
//    }
//}
