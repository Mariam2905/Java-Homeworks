package homeworks.enum_homeworks.enum2.exercise_5;

/**
 * Create an enum called "Season" that contains values for the four seasons (Spring, Summer, Autumn, Winter).
 * Each season should have an associated temperature range.
 * Write a program that prompts the user to enter a temperature,
 * and then prints the name of the season that corresponds to that temperature.
 * <p>
 * Example output:
 * Enter a temperature: 85 The temperature corresponds to Summer.
 * Enter a temperature: 40 The temperature corresponds to Winter.
 */
public enum Seasons {
    SPRING(17, 27),
    SUMMER(28, 43),
    AUTUMN(6, 16),
    WINTER(-20, 5);

    private int minTemperature;
    private int maxTemperature;

    Seasons(int minTemperature, int maxTemperature) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }
}
