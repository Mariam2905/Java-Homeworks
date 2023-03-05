package homeworks.enum_homeworks.enum1.exercise_2;

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
