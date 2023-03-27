package org.example.homeworks.collections.queue_and_deque;

import java.util.Collections;
import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();

        /**
         * 1. Implement a queue using LinkedList and add elements to it.
         */
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.addLast(5);
        queue.addFirst(7);
        queue.add(6);
        queue.addAll(5, Collections.singleton(8));
        System.out.println("Our queue is: " + queue);
    }
}
