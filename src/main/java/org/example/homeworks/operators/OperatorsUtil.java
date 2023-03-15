package org.example.homeworks.operators;

import java.util.Scanner;

public class OperatorsUtil {

    //  1․  Ստեղծել 2 փոփոխական(int a = 8, int b = 6), տպել console -ում
    void arithmeticOperators1() {
        int a = 8;
        int b = 6;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a % b);
    }

    //  2․  Ստեղծել 2 փոփոխական(double c = 6.4, double d = 0.03), տպել  console -ում
    void arithmeticOperators2() {
        double c = 6.4;
        double d = 0.03;
        System.out.println(c + d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c - d);
        System.out.println(c % d);
    }

    //  3․  Տպել  console -ում
    void result() {
        int x = 2 * ((5 + 3) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;
        System.out.println(x);
        System.out.println(y);
    }

    //  4․  Ստեղծել 2 փոփոխական(int e = 10,  int f = -88, boolean n1 = true), տպել console -ում
    void experience() {
        int e = 10;
        int f = -88;
        boolean n1 = true;
        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e + 92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }

    void answers() {
        int x = (int) 1.0;
        System.out.println(x);
        short y = (short) 1921222;
        System.out.println(y);
        System.out.println(2147483647 + 1);
        int f;
        long z = (f = 3);
        System.out.println(z);
        boolean t = false;
        boolean s = (t = true);
        System.out.println(s);
    }

    void relantionalOperators() {
        int aa = 10;
        int bb = 20;
        System.out.println(aa < bb);
        System.out.println(aa <= bb);
        System.out.println(aa >= bb);
        System.out.println(aa > bb);
    }

    void theFalse() {
        float y1 = 2.1f;
        System.out.println(y1);
        byte x1 = 5;
        byte x2 = 10;
        int x3 = x1 + x2;
        System.out.println(x3);
        short a1 = 10;
        short a2 = 3;
        int a3 = a1 * a2;
        System.out.println(a3);
        long k = 10L;
        int l = 5;
        long m = l * k;
        System.out.println(m);
    }

    //    Հայտարարել երկու int տիպի փոփոխականներ, վերագրել 10 և 5 այնուհետև փոփոխականի արժեքները տեղերով փոխել։
    void swapped1() {
        int v = 10;
        int r = 5;
        int v1 = r;
        r = v;
        System.out.println("Now v is " + v1);
        System.out.println("Now r is " + r);
    }

    void swapped2() {
        int v = 7;
        int r = 3;
        System.out.println("Original values of v is " + v);
        System.out.println("Original values of r is " + r);
        v = v + r;
        r = v - r;
        v = v - r;
        //        v = v ^ r ^ (r = v);    ինտերնետից սա էլ եմ գտել աշխատումա, բայց չհասկացա
        System.out.println("Swapped values of v is " + v);
        System.out.println("Swapped values of r is " + r);
    }

    //    Գրել ծրագիր, որը հաշվում է 1-100 թվերի գումարը։ (ցիկլ չoգտագործել)
    int sum(int number) {
//        ընդհանուր դեպքի համար
        int result = 0;
        int n1 = number;
        if (number % 2 == 1) {
            result = n1 * ((n1 / 2) + 1);
            System.out.println(result);
        } else {
            result = n1 * (n1 / 2) + n1 / 2;
            System.out.println(result);
        }
        return result;
/*      միայն 1-100 թվերի գումարի համար
        int number = 100;
        int result = 100*101/2;
        System.out.println(result);
        return result;
 */
    }


    void betwiseAndLogicalOperators() {
        int a3 = 8;
        int b3 = 3;
        System.out.println(a3 & b3);
        System.out.println(a3 ^ b3);
        System.out.println(a3 | b3);
        System.out.println(~a3);
        System.out.println(true || (a3 < 4));
        System.out.println((b3 >= 6) || (++a3 <= 7));
        System.out.println((a3 < b3) ? a3 : b3);
        System.out.println(b3 ^ b3);
    }

    void shiftOperator() {
        System.out.println(10 << 2);
        System.out.println(-10 << 3);
        System.out.println(20 >> 2);
        System.out.println(15 >> 3);
    }

    void shiftOperator2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int number = sc.nextInt();
        System.out.println(number << 3);
        System.out.println(number << 4);
    }

    public static void main(String[] args) {
        OperatorsUtil myOperatorsUtilHomework = new OperatorsUtil();
//        myOperatorsUtilHomework.arithmeticOperators1();
//        myOperatorsUtilHomework.arithmeticOperators2();
//        myOperatorsUtilHomework.result();
//        myOperatorsUtilHomework.experience();
//        myOperatorsUtilHomework.answers();
//        myOperatorsUtilHomework.relantionalOperators();
//        myOperatorsUtilHomework.theFalse();
//        myOperatorsUtilHomework.swapped1();
//        myOperatorsUtilHomework.swapped2();
//        myOperatorsUtilHomework.sum(200);
//        myOperatorsUtilHomework.betwiseAndLogicalOperators();
//        myOperatorsUtilHomework.shiftOperator();
        myOperatorsUtilHomework.shiftOperator2();
    }
}
