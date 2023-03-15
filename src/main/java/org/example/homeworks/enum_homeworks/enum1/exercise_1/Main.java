package org.example.homeworks.enum_homeworks.enum1.exercise_1;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Planets.EARTH.getYearLength());
        for (Planets planet : Planets.values()) {
            System.out.println("The planet " + planet + " revolves around the Sun in " + planet.getYearLength() + " days");
        }
    }
}
