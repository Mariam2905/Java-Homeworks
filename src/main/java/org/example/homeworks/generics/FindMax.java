package org.example.homeworks.generics;

import java.util.List;

public class FindMax {
    /**
     * 4.
     * This method finds the maximal element in the range [begin, end) of a list.
     *
     * @param list;
     * @param begin;
     * @param end;
     * @param <T>;
     * @return max;
     */
    <T extends Comparable<T>> T findMax(List<T> list, int begin, int end) {
        if (list == null || list.isEmpty() || begin >= end) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        if (begin < 0 || end > list.size()) {
            throw new IndexOutOfBoundsException("The begin and end numbers are incorrect.");
        }
        T max = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            T current = list.get(i);
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }
}
