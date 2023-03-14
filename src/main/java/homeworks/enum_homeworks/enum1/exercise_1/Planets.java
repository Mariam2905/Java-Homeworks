package homeworks.enum_homeworks.enum1.exercise_1;

/**
 * This work shows how many days it takes each planet to revolve around the sun.
 */
public enum Planets {
    MERCURY(88), VENUS(225), EARTH(365), MARS(687), JUPITER(4333), SATURN(10759), URANUS(30687), NEPTUNE(60200);
    private int yearLength;

    Planets(int yearLength) {
        this.yearLength = yearLength;
    }

    public int getYearLength() {
        return yearLength;
    }
}
