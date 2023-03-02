package homeworks.enum_homeworks.exercise_4;

import homeworks.enum_homeworks.exercise_1.Planets;

public class Main {
    public static void main(String[] args) {
        for (PlanetDistance planet : PlanetDistance.values()) {
            System.out.println("The planet " + planet + " is " + planet.getDistance()+ " million km distance from the sun");
        }
    }
}
