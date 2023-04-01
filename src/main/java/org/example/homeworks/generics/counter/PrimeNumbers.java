package org.example.homeworks.generics.counter;

public class PrimeNumbers implements SpecificCollectionProperty.Property<Integer> {
    /**
     * This method check if the given number is prime.
     * @param element;
     * @return if the element is prime;
     */
    @Override
    public boolean hasProperty(Integer element) {
        // 1 is not prime number
        if (element == 1)
            return false;

        for (int i = 2; i <= Math.sqrt(element); ++i) {
            if (element % i == 0)
                return false;
        }
        return true;
    }
}