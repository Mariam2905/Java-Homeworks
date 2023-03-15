package org.example.homeworks.enum_homeworks.enum1.exercise_4;

public class Main {
    public static void main(String[] args) {
        for (PlanetDistance planet : PlanetDistance.values()) {
            System.out.println("The planet " + planet + " is " + planet.getDistance()+ " million km distance from the sun");
        }
    }
}
