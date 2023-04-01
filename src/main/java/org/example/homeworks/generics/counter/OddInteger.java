package org.example.homeworks.generics.counter;

public class OddInteger implements SpecificCollectionProperty.Property<Integer> {
    /**
     * This method check if the given number is odd.
     * @param element;
     * @return the odd element;
     */
    @Override
    public boolean hasProperty(Integer element) {
        return element % 2 != 0;
    }
}