package org.example.homeworks.generics.counter;

public class Palindrome implements SpecificCollectionProperty.Property<String> {
    /**
     * This method check if the given string is palindrome.
     *
     * @param string;
     * @return if the given string is palindrome or not;
     */
    @Override
    public boolean hasProperty(String string) {
        if (string == null || string.isEmpty()) {
            System.out.println("the given string is empty or has no reference to the object");
            return false;
        }
        if (string.length() == 1) {
            return true;
        }
        for (int i = 0, j = string.length() - 1; i < string.length() / 2; ++i, --j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}