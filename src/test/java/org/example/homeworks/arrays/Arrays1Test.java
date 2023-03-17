package org.example.homeworks.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Arrays1Test {
    Arrays1 arrObj = new Arrays1();

    @Test
    void positiveNumberOfArray() {
//        assertTrue(arrObj.positiveNumberOfArray() == 0);
//        assertTrue(arrObj.positiveNumberOfArray() == -123);
//        assertFalse(arrObj.positiveNumberOfArray() == -123);
        assertEquals(arrObj.positiveNumberOfArray(), 0);
    }

    @Test
    void opposite() {
        assertTrue(arrObj.opposite() == 0);
//        assertTrue(arrObj.opposite() == 1);
//        assertTrue(arrObj.opposite() == 752);
    }

    @Test
    void maxElement() {
//        long[] array1 = {17, 25, 0, 124, -36, -19, 48};
//        assertTrue(arrObj.maxElement(array1) == 124);
//        assertFalse(arrObj.maxElement(array1) == 15);
//        assertEquals(arrObj.maxElement(array1), 7);
        assertEquals(124, arrObj.maxElement(new long[]{17, 25, 0, 124, -36, -19, 48}));
    }

    @Test
    void minElement() {
//        assertNotEquals(arrObj.minElement(), 45);
        assertEquals(arrObj.minElement(), -127.3f);
    }

    @Test
    void transfer1() {
        int[] arr1 = {12, 25, 36, 7};
        assertArrayEquals(arr1, arrObj.transfer1(arr1));
        assertFalse(arrObj.transfer1(arr1) == arr1);
    }

    @Test
    void sumOfElementsArray() {
//        int[] arr1 = {12, 25, 36, 47, 29};
//        int[] arr2 = {10, 2, 7, 4, 19};
//        int []arr3 = new int[arr1.length];
//        for (int i = 0; i < arr1.length; i++) {
//            arr3[i] = arr1[i] + arr2[i];
//        }
//        assertArrayEquals(arr3, arrObj.sumOfElementsArray(arr1, arr2));

        assertArrayEquals(new int[]{22, 27, 43, 51, 48}, arrObj.sumOfElementsArray(new int[]{12, 25, 36, 47, 29}, new int[]{10, 2, 7, 4, 19}));
    }

    @Test
    void repeatNumber() {
//        assertTrue(arrObj.repeatNumber(5) == 3);
        assertEquals(3, arrObj.repeatNumber(5));
    }

    @Test
    void descendingSequence() {
        int[] array = new int[]{124, 48, 25, 17, 0, -19, -36};
        assertArrayEquals(new int[]{124, 48, 25, 17, 0, -19, -36}, arrObj.descendingSequence(new int[]{17, 25, 0, 124, -36, -19, 48}));
    }

    @Test
    void longestIncreasingSubsequence() {
        int[] array = {1, 5, 6, 4, 9, 0, 4, 7, 7, 9, 1};
//        assertArrayEquals(new int[]{}, arrObj.longestIncreasingSubsequence());
        assertArrayEquals(new int[]{0, 4, 7, 7, 9}, arrObj.longestIncreasingSubsequence());
    }

    @Test
    void withBinaryForm() {
//        assertEquals(21, arrObj.withBinaryForm(new int[]{1, 1, 0, 0, 1, 1}));
        assertEquals(51, arrObj.withBinaryForm(new int[]{1, 1, 0, 0, 1, 1}));
    }
}