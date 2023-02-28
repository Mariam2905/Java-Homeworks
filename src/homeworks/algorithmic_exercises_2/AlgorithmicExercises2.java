package homeworks.algorithmic_exercises_2;

import java.util.Random;
import java.util.Scanner;

public class AlgorithmicExercises2 {

    /**
     * 1. Write a program that prompts the user to input a positive integer.
     * It should then print the multiplication table of that number.
     */
    void multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a positive integer: ");
        long number = sc.nextInt();
        int count = 1;
        while (count <= 10) {
            long result = number * count;
            System.out.println(number + "*" + count + "=" + result);
            count++;
        }
    }

    /**
     * 2. Two numbers are entered through the keyboard.
     * Write a program to find the value of one number raised to the power of another.
     * (Do not use Java built-in method)
     */
    long raisedToThePower() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write first number: ");
        int number1 = sc.nextInt();
        System.out.println("Please write second number: ");
        int number2 = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= number2; i++) {
            result = number1 * result;
        }
        System.out.println("The value of" + number1 + " raised to the power of " + number2 + " is " + result);
        return result;
    }

    /**
     * 3. Write a program that prompts the user to input an integer and
     * then outputs the number with the digits reversed.
     * For example, if the input is 12345, the output should be 54321.
     */
    int digitsReversed() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write your number: ");
        int number = sc.nextInt();
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println("The reversed number is " + reverse);
        return reverse;
    }

    /**
     * 4. Write a program that prompts the user to input a positive integer.
     * It should then output a message indicating whether the number is a prime number.
     */
    void primeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write your number: ");
        int number = sc.nextInt();
        boolean b = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                b = true;
                break;
            }
        }
        if (b) {
            System.out.println(number + " is not a prime number");
        } else {
            System.out.println(number + " is a prime number");
        }
    }

    /**
     * 5. Write a do-while loop that asks the user to enter two numbers.
     * The numbers should be added and the sum displayed.
     * The loop should ask the user whether he or she wishes to perform the operation again.
     * If so, the loop should repeat; otherwise it should terminate.
     * @return sum;
     */
    int repeat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write first number: ");
        int number1 = sc.nextInt();
        System.out.println("Please write second number: ");
        int number2 = sc.nextInt();
        System.out.println("If you wishes to perform the operation again?. if yes enter 1, if no enter 0");
        int number3 = sc.nextInt();
        int sum;
        do {
            sum = number1 + number2;
            if (number3 == 1) {
                repeat();
            } else {
                break;
            }
        }
        while (number3 == 0);
        System.out.println(sum);
        return sum;
    }

    /**
     * 6. Write a program to enter the numbers till the user wants
     * and at the end it should display the count of positive, negative and zeros entered.
     */
    void positiveNegativeAndZero() {
        Scanner sc = new Scanner(System.in);
        int number;
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        char choice;
        do {
            System.out.print("Enter the number ");
            number = sc.nextInt();
            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            } else {
                countZero++;
            }
            System.out.print("Do you want to continue? if yes enter Y or y ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }

    /**
     * 7. Write a program to enter the numbers till the user wants
     * and at the end the program should display the largest and smallest numbers entered.
     */
    void largestAndSmallest() {
        Scanner sc = new Scanner(System.in);
        int number;
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        char choice;
        do {
            System.out.print("Enter the number ");
            number = sc.nextInt();
            if (number > largestNumber) {
                largestNumber = number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;
            }
            System.out.print("Do you want to continue? if yes enter Y or y ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("The largest number is " + largestNumber);
        System.out.println("The smallest number is " + smallestNumber);
    }


    /**
     * 8. Write a program to print out all Armstrong numbers between 1 and 500.
     * If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
     * For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
     */
    void armstrongNumbers() {
        System.out.println("Armstrong numbers between 1 and 500 are: ");
        int number, digit;
        int sum = 0;
        for (int i = 1; i < 500; i++) {
            number = i;
            while (number > 0) {
                digit = number % 10;
                sum = sum + (digit * digit * digit);
                number = number / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
            sum = 0;
        }
    }

    /**
     * 9. Write a program to calculate the sum of following series where n is input by user.
     * 1/1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
     *
     * @param number;
     * @return result;
     */
    double sum(int number) {
        double result = 0.0;
        for (int i = 1; i <= number; i++) {
            result = result + 1.0 / i;
        }
        System.out.println(result);
        return result;
    }

    /**
     * 10. Compute the natural logarithm of 2, by adding up to n terms in the series
     * 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
     * where n is a positive integer and input by user.
     *
     * @param number;
     * @return result;
     */
    double log(int number) {
//        double result = Math.log(2);
        double result = 0.0;
        for (int i = 1; i <= number; i++) {
            if (i % 2.0 == 0) {
                result = result + 1.0 / -i;
            } else {
                result = result + 1.0 / i;
            }
        }
        System.out.println(result);
        return result;
    }


    /**
     * 11. Write a program that generates a random number and asks the user to guess what the number is.
     * If the user's guess is higher than the random number, the program should display
     * "Too high, try again." If the user's guess is lower than the random number,
     * the program should display "Too low, try again."
     * The program should use a loop that repeats until the user correctly guesses the random number.
     */
    void highOrLowRandom() {
        int answer;
        int experience;
        final int max = 100;
        Scanner sc = new Scanner(System.in);
        Random number = new Random();
        boolean correct = false;
        answer = number.nextInt(max) + 1;
        while (!correct) {
            System.out.println("Enter a number beween 1 and 100: ");
            experience = sc.nextInt();
            if (experience > answer) {
                System.out.println("Too high, try again.");
            } else if (experience < answer) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Congrulatin, you antred the true number.");
                correct = true;
            }
        }
    }

    /*
     * 12. Write a program to print following :
     */
    void rectangle() {
        for (int i = 1; i <= 4; i++) {
            System.out.print('*');
            for (int j = 1; j <= 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    void fromLeftToRight() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    void fromRightToLeft() {
        for (int i = 1; i <= 5; i++) {
            for (int j = (5 - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    void triangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5 - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    void pyramide() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5 - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    void pyramide2() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = i; k > 1; k--) {
                System.out.print(k);
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    /**
     * 13. Write a program to compute sinx for given x.
     * The user should supply x and a positive integer n.
     * We compute the sine of x using the series and the computation should use all terms in the series
     * up through the term involving xn
     * sin x = x - x3/3! + x5/5! - x7/7! + x9/9! .......
     * @return sin;
     */
    double sinx() {
//        System.out.println(Math.sin(7));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree: ");
        int x = sc.nextInt();
        System.out.println("Enter the number of the terms: ");
        int n = sc.nextInt();
        double radians = Math.toRadians(x);
        double sin = 0.0;
        double sum;
        int pow = 1;
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {
                sum = -Math.pow(radians, pow) / factorial(n);
            } else {
                sum = Math.pow(radians, pow) / factorial(n);
            }
            sin += sum;
            pow += 2;
        }
        System.out.println(sin);
        return sin;
    }

    long factorial(int n) {
        long factorial = 1L;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * 14. Write a program to compute the cosine of x. The user should supply x and a positive integer n.
     * We compute the cosine of x using the series and the computation should use all terms in the series
     * up through the term involving xn
     * cos x = 1 - x2/2! + x4/4! - x6/6! .....
     * @return cos,
     */
    double cosx() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree: ");
        int x = sc.nextInt();
        System.out.println("Enter the number of the terms: ");
        int n = sc.nextInt();
        double radians = Math.toRadians(x);
        double cos = 0.0;
        double sum;
        int pow = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = -Math.pow(radians, pow) / factorial(pow);
            } else {
                sum = Math.pow(radians, pow) / factorial(pow);
            }
            cos += sum;
            pow += 2;
        }
        System.out.println(cos);
        return cos;
    }

    public static void main(String[] args) {
        AlgorithmicExercises2 myAlgorithmicExercises2 = new AlgorithmicExercises2();
//        myAlgorithmicExercises2.multiplication();
//        myAlgorithmicExercises2.raisedToThePower();
//        myAlgorithmicExercises2.digitsReversed();
//        myAlgorithmicExercises2.primeNumber();
//        myAlgorithmicExercises2.repeat();
//        myAlgorithmicExercises2.positiveNegativeAndZero();
//        myAlgorithmicExercises2.largestAndSmallest();
        myAlgorithmicExercises2.armstrongNumbers();
//        myAlgorithmicExercises2.sum(5);
//        myAlgorithmicExercises2.log(5);
//        myAlgorithmicExercises2.highOrLowRandom();
//        myAlgorithmicExercises2.rectangle();
//        myAlgorithmicExercises2.fromLeftToRight();
//        myAlgorithmicExercises2.fromRightToLeft();
//        myAlgorithmicExercises2.triangle();
//        myAlgorithmicExercises2.pyramide();
//        myAlgorithmicExercises2.pyramide2();
//        myAlgorithmicExercises2.sinx();
//        myAlgorithmicExercises2.cosx();
    }
}
