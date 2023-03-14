package homeworks.enum_homeworks.enum2.exercise_3;

/**
 * Create an enum called "Planet" that contains values for the planets in the Solar System.
 * Each planet should have a name, a mass, and a distance from the Sun.
 * Write a program that prints the name and mass of each planet.
 */
public enum Planets {
    MERCURY("Mercury", 0.3285, 58),
    VENUS("Venus", 4.8673, 108),
    EARTH("Earth", 5.9722, 150),
    MARS("Mars", 0.6390, 228),
    JUPITER("Jupiter", 1899.1596, 778),
    SATURN("Saturn", 567.359, 1427),
    URANUS("Uranus", 83.6108, 2987),
    NEPTUNE("Neptune", 101.5274, 4497);

    private String name;
    private double mass;
    private double distanceFromSun;

    Planets(String name, double mass, double distanceFromSun) {
        this.name = name;
        this.mass = mass * Math.pow(10, 24);
        this.distanceFromSun = distanceFromSun * Math.pow(10, 6);
    }

    /**
     * This method returns the name of planet.
     *
     * @return name planet;
     */
    public String getName() {
        return name;
    }

    /**
     * This method returns distance of planet from sun with Kilometers.
     *
     * @return distance from sun with Kilometers.
     */
    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    /**
     * This method returns mass of planet with kilogram.
     *
     * @return mass of planet with kilogram.
     */
    public double getMass() {
        return mass;
    }
}
