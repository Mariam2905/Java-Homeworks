package org.example.homeworks.enum_homeworks.enum2.exercise_4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Days of the week
 * Create an enum called "DayOfWeek" that contains values for the days of the week.
 * Write a Java program that prompts the user to enter a day of the week,
 * and then prints whether that day is a weekday or a weekend day.
 */
public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int numberDay;

    DayOfWeek(int numberDay) {
        this.numberDay = numberDay;
    }

    /**
     * This method returns the number of the week.
     *
     * @return day of the week;
     */
    public int getNumberDay() {
        return numberDay;
    }
}
