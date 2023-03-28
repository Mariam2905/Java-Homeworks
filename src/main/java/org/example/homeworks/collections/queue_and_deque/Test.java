package org.example.homeworks.collections.queue_and_deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    public static <E> void main(String[] args) {
        QueueAndDeque obj = new QueueAndDeque();
        obj.addElementInQueue();
        obj.addElementInDeque();
        obj.addElementInQueueOfIntegers();
        obj.addElementInQueueOfStrings();
        obj.addElementInArrayDeque();
        obj.removeElementInQueue();
        obj.removeElementInDeque();
        Queue<String> eQueue = new PriorityQueue<>();
        eQueue.add("A");
        eQueue.add("B");
        eQueue.add("C");
        obj.checkElementInQueue(eQueue, "C");
        Deque<String> eDeque = new ArrayDeque<>();
        eDeque.add("M");
        eDeque.add("S");
        eDeque.add("L");
        obj.checkElementInDeque(eDeque, "L");
        obj.printNumberInQueue();
        obj.printColorsInQueue();
        obj.addInAnotherQueue();
        obj.removeFirstElementInQueue();
    }
}
