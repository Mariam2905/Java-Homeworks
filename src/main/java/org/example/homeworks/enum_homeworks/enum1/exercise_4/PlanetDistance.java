package org.example.homeworks.enum_homeworks.enum1.exercise_4;

/**
 * This program shows how many distance have each planet from the sun.
 */

public enum PlanetDistance {
    MERCURY(58000000), VENUS(108), EARTH(150), MARS(228), JUPITER(778), SATURN(1427), URANUS(2870), NEPTUNE(4497);
    private int distance;

    PlanetDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}
