package org.example.homeworks.algorithms.algorithms6;

public class Main {

    public static void main(String[] args) {
        int[] array = {21, 7, 22, -3, 86, 5, 19, 5, 29, 90, 0, 11, 8};
        SortAlgorithms sorts = new SortAlgorithms();
        System.out.println("Our array is: ");
        sorts.printArray(array);
        System.out.println("The sorted array is: ");
//        int[] sortedArray1 = sorts.bubbleSort(array);
//        sorts.printArray(sortedArray1);
//        int[] sortedArray2 = sorts.selectionSort(array);
//        sorts.printArray(sortedArray2);
//        int[] sortedArray3 = sorts.insertionSort(array);
//        sorts.printArray(sortedArray3);
        int[] sortedArray4 = sorts.mergeSort(array);
        sorts.printArray(sortedArray4);
    }
}
