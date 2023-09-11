package org.example.homeworks.threads.threads2.producter_consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class WareHouse {
    static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
}
