package org.example.homeworks.threads.threads2.producter_consumer;

import java.util.Random;

public class Producer extends Thread{
    public static void producer() throws InterruptedException{
        Random random = new Random();

        while (true){
            WareHouse.queue.put(random.nextInt(10));

        }
    }
}
