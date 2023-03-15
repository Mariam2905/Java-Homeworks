package org.example.practics.first_lesson;

import java.util.Scanner;

public class FirstLesson {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name ");
//        String name = input.next();
//        System.out.println("Enter your age ");
//        int age = input.nextInt();
//        System.out.println(name + " is " + age + " years old.");

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a three-digit number to calculate the sum of the digits ");
//        int number = input.nextInt();
//        int number1 = number / 100;
//        int number2 = (number - number1 * 100) / 10;
//        int number3 = number - number1 * 100 - number2 * 10;
//        int summer = number1 + number2 + number3;
//        System.out.println("The sum of the digits of the entered three-digit number is equal " + summer);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number for transform the seconds ");
        int number = input.nextInt();
        int day = number / 86400;
        int hour = (number - day * 86400) / 3600;
        int minute = (number - day * 86400 - hour * 3600) / 60;
        int second = number - day * 86400 - hour * 3600 - minute * 60;
        System.out.println(number + " seconds is " + day + " day " + hour + " hours " + minute + " minutes and " + second + " seconds");
    }
}
