package org.example.homeworks.arrays;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


class ArraysPracticsTest {
    ArraysPractics arraysPractics = new ArraysPractics();

    @Test
    void largestAndSmallestElement() {
        int expectedMin = -124;
        int expectedMax = 479;
        int numbers[] = {14, 58, -124, 0, 479, -25, 73};
        int actualMin = numbers[0];
        int actualMax = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > actualMax)
                actualMax = numbers[i];
            else if (numbers[i] < actualMin)
                actualMin = numbers[i];
        }
        assertEquals(expectedMin, actualMin);
        assertEquals(expectedMax, actualMax);
    }


    //         Assert.assertEquals(4, calculator.addNumbers(2, 2));
    @Test
    void sumOfElements() {
        int actual = 10;
        int expected = 15;
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
        assertEquals(expected, actual);
    }

    @Test
    void mergingArray() {


    }

    @Test
    void diagonalSum() {
    }

    private static class Assert {
    }
}