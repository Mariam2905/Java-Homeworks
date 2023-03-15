package org.example.practics.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        String fName, lName, a;
        char group;
        int age;
        System.out.println("Enter your first name: ");
        fName = scs.nextLine();
        System.out.println("Enter your last name: ");
        fName = scs.nextLine();
        System.out.println("Enter your group: ");
        a = scs.nextLine();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        try {
            group = a.charAt(a.length());
            System.out.println(age / 0);
        } catch (
                ArithmeticException e) {
            System.out.println("Age can't be devided by zero.");
        } catch (
                StringIndexOutOfBoundsException e) {
            System.out.println("Aaaaa");
            throw new IndexOutOfBoundsException("sds");
        } catch (Exception e) {
            System.out.println("Bbbbb");
        } finally {
            System.out.println("Oooo");
        }
    }
}
