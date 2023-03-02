package homeworks.enum_homeworks.exercise_2;

import homeworks.enum_homeworks.exercise_1.Planets;

public class Main {
    public static void main(String args[]) {
//        for (DaysOfTheWeek days : DaysOfTheWeek.values()) {
//            System.out.println(days.name());
//        }
        DaysOfTheWeek array[] = DaysOfTheWeek.values();
        for (DaysOfTheWeek days : array) {
            System.out.println(days + " at index " + days.ordinal());
        }
    }
}
