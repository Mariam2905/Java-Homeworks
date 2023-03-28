package org.example.homeworks.collections.queue_and_deque;

import java.util.*;

public class QueueAndDeque {

    /**
     * 1.
     * This method add element in queue.
     */
    void addElementInQueue() {
        Queue queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
    }

    /**
     * 2.
     * This method add element in deque.
     */
    void addElementInDeque() {
        Deque deque = new LinkedList<>();
        deque.add(4);
        deque.add(5);
        deque.add(6);
    }

    /**
     * 3.
     * This method create a priority queue of integers and add elements to it.
     */
    void addElementInQueueOfIntegers() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(7);
        priorityQueue.add(8);
        priorityQueue.add(9);
    }

    /**
     * 4.
     * This method create a priority queue of strings and add elements to it.
     */
    void addElementInQueueOfStrings() {
        PriorityQueue<String> priorityQueueString = new PriorityQueue<>();
        priorityQueueString.add("Java");
        priorityQueueString.add("Python");
        priorityQueueString.add("C++");
    }

    /**
     * 5.
     * This method create a deque using ArrayDeque and add elements to it.
     */
    void addElementInArrayDeque() {
        Deque<String> stringDeque = new ArrayDeque<>();
        stringDeque.add("Hello");
        stringDeque.add("World");
        stringDeque.add("BDG");
    }

    /**
     * 7.
     * This method remove elements from a queue until it is empty.
     */
    void removeElementInQueue() {
        Queue<Integer> queue1 = new PriorityQueue<>();
        while (!queue1.isEmpty()) {
            queue1.remove();
        }
    }

    /**
     * 8.
     * This method remove elements from a deque until it is empty.
     */
    void removeElementInDeque() {
        Queue<Integer> deque1 = new PriorityQueue<>();
        while (!deque1.isEmpty()) {
            deque1.remove();
        }
    }

    /**
     * 9.
     * This method check if an element is present in a queue.
     *
     * @param eQueue;
     * @param element;
     * @param <E>;
     * @return if the element in queue;
     */
    <E> boolean checkElementInQueue(Queue<E> eQueue, E element) {
        for (E e : eQueue) {
            if (element.equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 10.
     * This method check if an element is present in a deque.
     *
     * @param eDeque;
     * @param element;
     * @param <E>;
     * @return if the element in queue;
     */
    <E> boolean checkElementInDeque(Deque<E> eDeque, E element) {
        for (E e : eDeque) {
//            if (element.equals(element)) {
//                return true;
//            }
            if (eDeque.contains(element)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 11.
     * This method print from queue first 50 members for given N.
     * N = 1,3,5,7,9,…
     */
    void printNumberInQueue() {
        Queue<Integer> queue = new LinkedList<>();
        try {
            if (queue.isEmpty()) {
                throw new NullPointerException("Add over 50 elements.");
            }
            for (int i = 0; i < 50; i += 2) {
                queue.add(i);
            }
            System.out.println(queue);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 12.
     * This method create a new priority queue, add some colors (string)
     * and print out the elements of the priority queue.
     */
    void printColorsInQueue() {
        PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Green");
        for (String item : colors) {
            System.out.println(item + " ");
        }
    }

    /**
     * 13.
     * This method add all the elements of a priority queue to another priority queue.
     */
    void addInAnotherQueue() {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(11);
        pq1.add(12);
        pq1.add(13);
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(14);
        pq2.add(15);
        pq2.add(16);
        pq2.add(17);
        pq2.addAll(pq1);
        while (!pq2.isEmpty()) {
            System.out.print(pq2.poll() + " ");
        }
        System.out.println(pq2);
    }

    /**
     * 14.
     * This method retrieve and remove the first element.
     */
    void removeFirstElementInQueue() {
        Queue<String> queue3 = new PriorityQueue<>();
        queue3.add("Kindergarten");
        queue3.add("School");
        queue3.add("College");
        queue3.add("University");
        System.out.println(queue3);
    }
}
