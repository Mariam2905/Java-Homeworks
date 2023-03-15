package org.example.homeworks.enum_homeworks.enum2.exercise_5;

public class SeasonsTemperatures {
    /**
     * This method prints the name of the season that corresponds to that temperature.
     *
     * @param temperature;
     */
    public void findSeasons(int temperature) {
        if (temperature >= Seasons.SPRING.getMinTemperature() && temperature <= Seasons.SPRING.getMaxTemperature()) {
            System.out.println("The " + temperature + " temperature corresponds to " + Seasons.SPRING + " season.");
        } else if (temperature >= Seasons.SUMMER.getMinTemperature() && temperature <= Seasons.SUMMER.getMaxTemperature()) {
            System.out.println("The " + temperature + " temperature corresponds to " + Seasons.SUMMER + " season.");
        } else if (temperature >= Seasons.AUTUMN.getMinTemperature() && temperature <= Seasons.AUTUMN.getMaxTemperature()) {
            System.out.println("The " + temperature + " temperature corresponds to " + Seasons.AUTUMN + " season.");
        } else if (temperature >= Seasons.WINTER.getMinTemperature() && temperature <= Seasons.WINTER.getMaxTemperature()) {
            System.out.println("The " + temperature + " temperature corresponds to " + Seasons.WINTER + " season.");
        } else {
            System.out.println("You have entered the wrong temperature.");
        }
    }
}
