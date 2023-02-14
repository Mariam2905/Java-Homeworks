package homeworks.methods;

public class MethodsHomework {

    //    1. Write a method which has two input parameters type int and return 0.
    public static int theSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
        return 0;
    }

    //    2. Write a method which has no
    //    t input parameters and returns nothing.
    public static void nothing() {
        System.out.println("This is a method which has not input parameters and returns nothing");
    }

    //    3. Write a method which has a boolean input parameters and print “Hello World”.
    public static void booleanInput(boolean text) {
        if (text == true) {
            System.out.println("Hello World.");
        } else System.out.println();
    }

    //    4. Write a method which has a char input parameter and return this input parameter.
    public static char sameType(char symbol) {
        System.out.println(symbol);
        return 0;
    }

    //    5. Write a method which has two float input parameters and return one of them.
    public static float oneOfThem(double num1, double num2) {
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
        return 0;
    }

    //    6. Write a method which has call itself inside body(recursion).
    public static int recursion(int count) {
        if (count < 7) {
            System.out.println("This is recursion");
            count++;
            recursion(count);
        }
        return 0;
    }

    public static void main(String[] args) {
        theSum(7, 5);
        nothing();
        booleanInput(true);
        sameType('A');
        oneOfThem(4.5, -79.23);
        recursion(2);
    }
}
