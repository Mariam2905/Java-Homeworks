package org.example.homeworks.enum_homeworks.enum2.exercise_1;

public class Test {
    public static void main(String[] args) {
        TrafficLight trafficLight1 = new TrafficLight(States.RED);
        System.out.println(trafficLight1.getState());
        TrafficLight trafficLight2 = new TrafficLight(States.YELLOW);
        System.out.println(trafficLight2.getState());
        TrafficLight trafficLight3 = new TrafficLight(States.GREEN);
        System.out.println(trafficLight3.getState());
    }
}
