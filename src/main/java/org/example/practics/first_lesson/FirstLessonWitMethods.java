package org.example.practics.first_lesson;

public class FirstLessonWitMethods {

    public static void textGiven(int age) {
        System.out.println("Mariam is " + age + " years old.");
    }

    public static void theSummerOfDigitsNumber(int number) {
        int number1 = number / 100;
        int number2 = (number - number1 * 100) / 10;
        int number3 = number - number1 * 100 - number2 * 10;
        int summer = number1 + number2 + number3;
        System.out.println("The sum of the digits of the number " + number + " is equal " + summer);
    }

    public static void transformSeconds(int number) {
        int day = number / 86400;
        int hour = (number - day * 86400) / 3600;
        int minute = (number - day * 86400 - hour * 3600) / 60;
        int second = number - day * 86400 - hour * 3600 - minute * 60;
        System.out.println(number + " seconds is " + day + " day " + hour + " hours " + minute + " minutes and " + second + " seconds");
    }

    public static void main(String[] args) {
        textGiven(32);
        theSummerOfDigitsNumber(123);
        transformSeconds(180075);
    }
}
