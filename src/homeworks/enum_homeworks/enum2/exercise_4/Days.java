package homeworks.enum_homeworks.enum2.exercise_4;

public class Days {

    /**
     * This method return what type is a the day;
     * @param day
     */
    public void typeTheDay(DayOfWeek day) {
        if (day.getNumberDay() >= 1 && day.getNumberDay() <= 5) {
            System.out.println(day.name() + " is a weekday");
        } else if (day.getNumberDay() == 6 || day.getNumberDay() == 7) {
            System.out.println(day.name() + " is a weekend day");
        }
    }
}
