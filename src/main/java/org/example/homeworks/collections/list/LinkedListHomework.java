package org.example.homeworks.collections.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListHomework {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>(List.of("Peach", "Cherry", "Orange", "Apple"));

//        10. Write a Java program to iterate through all elements in a linked list.
        for (String item : fruits) {
            System.out.print(item + " ");
        }

        System.out.println();

//        11. Write a Java program to iterate a linked list in reverse order.
        Collections.reverse(fruits);
        System.out.print(fruits);

        System.out.println();

//        12. Write a Java program to insert elements into the linked list at the first and last position.
//        fruits.addFirst("Strawberry");
        fruits.add(0, "Strawberry");
        for (String item : fruits) {
            System.out.print(item + " ");
        }

        System.out.println();

//        13. Write a Java program to insert the specified element at the end of a linked list.
//        fruits.add(fruits.size(), "Grapes");
//        fruits.addLast("Grapes");
        fruits.add("Kiwi");
        for (String item : fruits) {
            System.out.print(item + " ");
        }

        System.out.println();

//        14. Write a Java program to remove first and last element from a linked list.
        fruits.remove(fruits.getFirst());
        fruits.remove(fruits.getLast());
        System.out.println(fruits);

//        15. Write a Java program to clone a linked list to another linked list.
        LinkedList<String> fruits1 = (LinkedList<String>) fruits.clone();
        System.out.println(fruits1);

//        16. Write a Java program to test a linked list is empty or not.
        if (fruits.isEmpty()) {
            System.out.println("Given list is empty.");
        } else {
            System.out.println("Given list is not empty.");
        }
    }
}
