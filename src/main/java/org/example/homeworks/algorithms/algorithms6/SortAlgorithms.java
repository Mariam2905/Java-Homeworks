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
        int n = array.length;
        if (n > 1) {
            int mid = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, n);
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
        return array;
    }

    void merge(int[] array, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    /**
     * This method sorts an array with Quick sort.
     *
     * @param array;
     * @param start;
     * @param end;
     * @return array;
     */
    int[] quickSort(int[] array, int start, int end) {
        try {
            if (start > array.length) {
                throw new IndexOutOfBoundsException("You can't enter a start number greater than the array length.");
            }
            if (start < end) {
                int pivotIndex = partition(array, start, end);
                quickSort(array, start, pivotIndex - 1);
                quickSort(array, pivotIndex + 1, end);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return array;
    }

    int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        return i + 1;
    }

    /**
     * This method sorts an array with Heap sort.
     *
     * @param array;
     * @return array;
     */
    int[] heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
        return array;
    }

    void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
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
