package homeworks.arrays;

import java.util.Scanner;

public class ArraysPractics {
    /**
     * 1. Write a Java program to find the largest and smallest element of an array.
     */
    void largestAndSmallestElement() {
        int numbers[] = {14, 58, -124, 0, 479, -25, 73};
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];
        }
        System.out.println("Largest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);
    }

    /**
     * 2. Write a program that creates an array of 10 elements size.
     * Your program should prompt the user to input numbers in array and
     * then display the sum of all array elements.
     */
    int sumOfElements() {
        int[] array = new int[10];
        Scanner myScanner = new Scanner(System.in);
        int i = 0;
        System.out.println();
        System.out.println("Enter 10 number: ");
        while (i < 10) {
            array[i] = myScanner.nextInt();
            i++;
        }
        int sum = 0;
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.print(sum);
        return sum;
    }

    /**
     * 3. Suppose A, B, C are arrays of integers.
     * The numbers in array A appear in ascending order while the numbers in array B appear in descending order.
     * Write a user defined method in Java to produce third array C by merging arrays A and B in ascending order.
     * Use A, B and C as arguments in the method.
     */
    void mergingArray(int[] A, int[] B, int[] C) {
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            C[index] = A[i];
            index++;
        }
        for (int j = 0; j < B.length; j++) {
            C[index++] = B[j];
        }
        System.out.println("The merging array is: ");
        for (int m = 0; m < C.length; m++) {
            System.out.print(C[m] + " ");
        }
//        for (int k = 0; k < C.length; k++) {
//            Arrays.sort(C);
//        }
        System.out.println();
        System.out.println("The sorting array is: ");
        for (int k = 0; k <= C.length - 1; k++) {
            LABEL:
            for (int l = 0; l < C.length - 1; l++) {
                if (C[l] <= C[l + 1]) {
                    continue LABEL;
                } else {
                    int flag = C[l];
                    C[l] = C[l + 1];
                    C[l + 1] = flag;
                }
            }
            System.out.print(C[k] + " ");
        }
    }

    /**
     * 4. Write user defined methods for square matrix to calculate
     * Left diagonal sum
     * Right diagonal sum
     */
    void diagonalSum() {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {1, 14, 15, 16}};
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        int diagonalsSsum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    leftDiagonalSum += array[i][j];
                } else if (i + j == array.length - 1) {
                    rightDiagonalSum += array[i][j];
                }
                diagonalsSsum = leftDiagonalSum + rightDiagonalSum;
            }
        }
        System.out.println(leftDiagonalSum);
        System.out.println(rightDiagonalSum);
        System.out.println(diagonalsSsum);
    }

    public static void main(String[] args) {
        ArraysPractics myWork = new ArraysPractics();
//        myWork.largestAndSmallestElement();
//        myWork.sumOfElements();
        int[] A = {1, 2, 3, 4, 5, 8};
        int[] B = {10, 9, 8, 7, 6};
        int[] C = new int[A.length + B.length];
        myWork.mergingArray(A, B, C);
//        myWork.diagonalSum();
    }
}
