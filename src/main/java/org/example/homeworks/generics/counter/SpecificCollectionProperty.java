package org.example.homeworks.generics.counter;

import java.util.Collection;

public class SpecificCollectionProperty {
    /**
     * 7.
     * This method counts the number of elements in a collection
     * that have a specific property (e.g., odd integers, prime numbers, palindromes).
     * @param collection;
     * @param property;
     * @param <T>;
     * @return count;
     */
    public static <T> int countElements(Collection<T> collection, Property<T> property) {
        int count = 0;
        for (T element : collection) {
            if (property.hasProperty(element)) {
                count++;
            }
        }
        return count;
    }

    interface Property<T> {
        boolean hasProperty(T element);
    }
}
