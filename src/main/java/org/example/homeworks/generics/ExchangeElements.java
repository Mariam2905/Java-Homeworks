package org.example.homeworks.generics;

public class ExchangeElements {
    /**
     * 1.
     * This method swaps the positions of two different elements in an array.
     *
     * @param array;
     * @param index1;
     * @param index2;
     * @param <T>;
     */
    <T> void exchangeElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
