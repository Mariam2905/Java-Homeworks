package org.example.homeworks.algorithms.algorithms6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SortAlgorithmsTest {
    SortAlgorithms sort = new SortAlgorithms();
    int[] array = {-3, 0, 5, 5, 7, 8, 11, 19, 21, 22, 29, 86, 90};

    @Test
    void bubbleSort() {
        Assertions.assertArrayEquals(array, sort.bubbleSort(new int[]{21, 7, 22, -3, 86, 5, 19, 5, 29, 90, 0, 11, 8}));
        Assertions.assertArrayEquals(new int[]{}, sort.bubbleSort(new int[]{}));
        Assertions.assertArrayEquals(new int[]{36}, sort.bubbleSort(new int[]{36}));
    }

    @Test
    void selectionSort() {
        Assertions.assertArrayEquals(new int[]{}, sort.selectionSort(new int[]{}));
        Assertions.assertArrayEquals(new int[]{36}, sort.selectionSort(new int[]{36}));
    }

    @Test
    void insertionSort() {
        Assertions.assertArrayEquals(array, sort.insertionSort(new int[]{21, 7, 22, -3, 86, 5, 19, 5, 29, 90, 0, 11, 8}));
        Assertions.assertArrayEquals(new int[]{}, sort.insertionSort(new int[]{}));
        Assertions.assertArrayEquals(new int[]{36}, sort.insertionSort(new int[]{36}));
    }

    @Test
    void mergeSort() {
        Assertions.assertArrayEquals(array, sort.mergeSort(new int[]{21, 7, 22, -3, 86, 5, 19, 5, 29, 90, 0, 11, 8}));
        Assertions.assertArrayEquals(new int[]{}, sort.mergeSort(new int[]{}));
        Assertions.assertArrayEquals(new int[]{36}, sort.mergeSort(new int[]{36}));
    }

    @Test
    void quickSort() {
        Assertions.assertArrayEquals(array, sort.quickSort(new int[]{21, 7, 22, -3, 86, 5, 19, 5, 29, 90, 0, 11, 8}, 0, array.length - 1));
    }

    @Test
    void heapSort() {
        Assertions.assertArrayEquals(array, sort.heapSort(new int[]{21, 7, 22, -3, 86, 5, 19, 5, 29, 90, 0, 11, 8}));
        Assertions.assertArrayEquals(new int[]{}, sort.heapSort(new int[]{}));
        Assertions.assertArrayEquals(new int[]{36}, sort.heapSort(new int[]{36}));
    }
}