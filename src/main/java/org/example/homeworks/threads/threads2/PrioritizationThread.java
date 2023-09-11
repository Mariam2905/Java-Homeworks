package org.example.homeworks.threads.threads2;

public class PrioritizationThread extends Thread {
    public static void main(String[] args) {

        PrioritizationThread th1 = new PrioritizationThread();
        PrioritizationThread th2 = new PrioritizationThread();
        PrioritizationThread th3 = new PrioritizationThread();

        System.out.println("Priority of the thread th1 is : " + th1.getPriority());
        System.out.println("Priority of the thread th2 is : " + th2.getPriority());
        System.out.println("Priority of the thread th3 is : " + th3.getPriority());

        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.NORM_PRIORITY);
        th3.setPriority(Thread.MIN_PRIORITY);


//        th1.setPriority(3);
//        th2.setPriority(5);
//        th3.setPriority(7);
//
//
//        Thread.currentThread().setPriority(10);
//
//        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());

        th1.start();
        th2.start();
        th3.start();

    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " is running");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
