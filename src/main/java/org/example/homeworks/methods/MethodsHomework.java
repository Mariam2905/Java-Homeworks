package org.example.homeworks.methods;

public class MethodsHomework {

    //    1. Write a method which has two input parameters type int and return 0.
    int theSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    //    2. Write a method which has not input parameters and returns nothing.
    void nothing() {
        System.out.println("This is a method which has not input parameters and returns nothing");
    }

    //    3. Write a method which has a boolean input parameters and print “Hello World”.
    boolean booleanInput(boolean text) {
        boolean flag = true;
        if (text == flag) {
            System.out.println("Hello World.");
        } else {
            System.out.println();
        }
        return flag;
    }

    //    4. Write a method which has a char input parameter and return this input parameter.
    char sameType(char symbol) {
        return symbol;
    }

    //    5. Write a method which has two float input parameters and return one of them.
    void oneOfThem(double num1, double num2) {
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }

    //    6. Write a method which has call itself inside body(recursion).
    void recursion(int count) {
        if (count < 7) {
            System.out.println("This is recursion");
            count++;
            recursion(count);
        }
    }

    public static void main(String[] args) {
        MethodsHomework myMethodsHomework = new MethodsHomework();
//        System.out.println(myMethodsHomework.theSum(7, 5));
//        myMethodsHomework.nothing();
//        myMethodsHomework.booleanInput(true);
//        System.out.println(myMethodsHomework.sameType('A'));
//        myMethodsHomework.oneOfThem(4.5, -79.23);
        myMethodsHomework.recursion(2);
    }
}
