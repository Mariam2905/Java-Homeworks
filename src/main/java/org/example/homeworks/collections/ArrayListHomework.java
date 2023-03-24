package org.example.homeworks.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListHomework {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");

//        List<String> languages1 = new ArrayList<>(List.of("Java", "Python", "JavaScript"));


//        1. Write a Java program to iterate through all elements in an array list.
//        /**
//         * This loop iterate through all elements in an array list.
//         */
        for (String item : languages) {
            System.out.print(item + " ");
        }

        System.out.println();

//        2. Write a Java program to insert an element into the array list at the first position.
//        /**
//         * This method insert an element into the array list at the first position.
//         */
        languages.add(0, "Kotlin");
        for (int i = 0; i < languages.size(); i++) {
            System.out.print(languages.get(i));
            System.out.print(" ");
        }

        System.out.println();

//        3. Write a Java program to update specific array element by given element.
        languages.set(3, "C++");
        for (String item : languages) {
            System.out.print(item + " ");
        }

        System.out.println();

//        4. Write a Java program to search an element in an array list.
        if (languages.contains("C#")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }

//        5. Write a Java program to copy one array list into another.
        List<String> copyOfLanguages = new java.util.ArrayList<>(languages);
        System.out.println(copyOfLanguages);

//        6. Write a Java program to reverse elements in an array list.
        Collections.reverse(languages);
        System.out.println(languages);

//        7. Write a Java program of swap two elements in an array list.
        Collections.swap(languages, 1, 2);
        System.out.println(languages);

//        8. Write a Java program to test an array list is empty or not.
        if (languages.isEmpty()) {
            System.out.println("Given list is empty.");
        } else {
            System.out.println("Given list is not empty.");
        }

//        9. Write a Java program to increase the size of an array list.
        System.out.println("Our initial list is: " + languages);
        languages.ensureCapacity(3);
        languages.add("Go");
        languages.add("Swift");
        languages.add("PHP");
        System.out.println("New increased list is: " + languages);
    }
}
