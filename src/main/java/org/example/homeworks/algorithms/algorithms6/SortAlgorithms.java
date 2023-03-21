package org.example.homeworks.algorithms.algorithms6;

import java.util.Arrays;

public class SortAlgorithms {

    /**
     * This method sorts an array with Bubble sort.
     *
     * @param array;
     * @return array;
     */
    int[] bubbleSort(int[] array) {
        int n = array.length;
        int temp;
        try {
            if (array.length == 1) {
                throw new IllegalArgumentException("An array has one element and is not sortable․");
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return array;
    }


    /**
     * This method sorts an array with Selection sort.
     *
     * @param array;
     * @return array;
     */
    int[] selectionSort(int[] array) {
        int n = array.length;
        int temp;
        int minimumIndex;
        try {
            if (array.length == 0) {
                throw new IllegalArgumentException("This array has not an element․");
            }
            for (int i = 0; i < n - 1; i++) {
                minimumIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (array[j] < array[minimumIndex]) {
                        minimumIndex = j;
                    }
                    temp = array[minimumIndex];
                    array[minimumIndex] = array[i];
                    array[i] = temp;
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return array;
    }

    /**
     * This method sorts an array with Insertion sort.
     *
     * @param array;
     * @return array;
     */
    int[] insertionSort(int[] array) {
        int n = array.length;
        try {
            if (array.length == 1) {
                throw new IllegalArgumentException("An array has one element and is not sortable․");
            }
            for (int i = 1; i < n; ++i) {
                int temp = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > temp) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = temp;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return array;
    }

    /**
     * This method sorts an array with Merge sort.
     *
     * @param array;
     * @return array;
     */
    int[] mergeSort(int[] array) {

        return array;
    }


    /**
     * This method print the input array.
     *
     * @param array;
     */
    void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
