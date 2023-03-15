package org.example.homeworks.statements;

import java.util.Scanner;

public class StatementsHomework {

    /**
     * 1. Գրել method, որը ստուգում է տրված x ամբողջ թիվը զույգ է թե կենտ
     *
     * @param number;
     */
    void pairOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Տրված թիվը զույգ է");
        } else {
            System.out.println("Տրված թիվը կենտ է");
        }
    }

    /**
     * 2. Գրել method, որը ստուգում է տրված  x ամբողջ  թիվը դրական է թե բացասական
     *
     * @param number;
     */
    void positiveOrNegative(int number) {
        if (number < 0) {
            System.out.println("Տրված թիվը բացասական է");
        } else {
            System.out.println("Տրված թիվը դրական է");
        }
    }

    /**
     * 3. Գրել method, որը ստուգում է տրված x ամբողջ  թիվը  ՝ կամ փոքր 8 ից  և մեծ 5 ից
     * Կամ փոքր  20 ից և մեծ 15 ից ․
     *
     * @param number;
     */
    void bigOrSmall(int number) {
        if ((number < 8 && number > 5) || (number < 20 && number > 15)) {
            System.out.println("Տրված թիվը փոքր է 8-ից և մեծ է 5-ից կամ տրված թիվը փոքր է 20-ից և մեծ է 15-ից։");
        } else {

            System.out.println("այլ");
        }
    }

    /**
     * 4.Գրել method, որը ստուգում է տրվածդ ամբողջ թիվը կարող է բաժանվել 5-ի և 7-ի վրա առանց մնացորդի.
     *
     * @param number;
     */
    void divisionBy5To7(int number) {
        if (number % 5 == 0 && number % 7 == 0) {
            System.out.println(number + " թիվը բաժանվում է 5-ի և 7-ի վրա առանց մնացորդի");
        } else {
            System.out.println(number + " թիվը չի բաժանվում է 5-ի և 7-ի վրա առանց մնացորդի");
        }
    }

    /**
     * 5. Գրել method, որը ստուգում է տրված եռանիշ թվի երկրորդ թվանշանը 7 է թե ոչ։
     * Օրինակ։ 974 -> true, 846 -> false
     *
     * @param threeDigitNumber;
     */
    void threeDigitNumber(int threeDigitNumber) {
        int n1 = threeDigitNumber / 10;
        int n2 = n1 % 10;
        if (n2 == 7) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    /**
     * 6․ Գրել method, որը ստուգում է (x,y) կորդինատներով կետը գտնվում է արդյոք K(0,5) շրջանի մեջ թե ոչ։
     *
     * @param a;
     * @param b;
     */
    void inInside(int a, int b) {
        int x = 0;
        int y = 5;
        int r = (int) Math.sqrt(Math.pow(x, 2) + (int) Math.pow(y, 2));
        if (Math.pow((x - a), 2) + Math.pow((y - b), 2) <= Math.pow(r, 2)) {
            System.out.println("Inside");
        } else System.out.println("Outside");
    }

    /**
     * 7. Գրել method, որը գտնում է տրված 3 թվերից մեծագույնը։
     *
     * @param number1;
     * @param number2;
     * @param number3;
     * @return max;
     */
    int maxElement(int number1, int number2, int number3) {
        int array[] = {number1, number2, number3};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
        return max;
    }

    /**
     * 8․ Գրե՛ք method, որը ստուգում է տրված տարին համարվում է արդյոք նահանջ։
     * (նահանջ է համարվում այն տարին, որը
     * բաժանվում է 4-ի`բացառություն է արվում այն տարիների համար, որոնք 100-ի բաժանվող են։
     * Այդ տարիները նահանջ են միայն եթե նաև բաժանվում են 400-ի։
     * Նահանջ տարում ավելանում է լրացուցիչ օր՝ փետրվարի 29-ը։)
     * Օրինակ։ նահանջ են 1880,2004,2020,1600
     * նահանջ չեն 1991, 1700,1900, 2013
     *
     * @param date;
     */
    void leapYear(int date) {
        if (date % 4 == 0 & date % 100 != 0) {
            System.out.println(date + " year is leap.");
        } else if (date % 100 == 0 & date % 400 == 0) {
            System.out.println(date + " year is leap.");
        } else {
            System.out.println(date + " year is not leap.");
        }
    }

    /* 9. Ինչ ավելացնենք  ___ բաց թողնված դիրքում որ տպի 8 ․
     int x = 0;
     while (x++ < 10) {
     ____
     }
     System.out.println(x);

     */
    void printNumber() {
        int x = 0;
        while (x++ < 10) {
            if (x == 8) {
                System.out.println(x);
            }
        }
    }

    /*10. Գտնել սխալը և ուղղել․
    1)   int x = 2;
          int y = 5;
         while(x < 10) {
          y++;
          }
 */
    void theTrue() {
        int x = 2;
        while (x < 10) {
            x++;
            System.out.println(x);
        }
    }

    /*10. Գտնել սխալը և ուղղել․
   2)   int x = 15;
            while (x > 10) {
              x = x--;
            }
            System.out.println(x)
*/
    void theTrue2() {
        int x = 15;
        while (x > 10) {
            x--;
            System.out.println(x);
        }
    }

    /**
     * 11.Գրել method, որը console -ում  տպում է  1 ից  200 թվերը․
     */
    void theNumbers() {
        for (int i = 1; i <= 200; i++) {
            System.out.print(i + " ");
        }
    }

    /**
     * 12․  Գրել method, որը console -ում տպում է տրված թվի առաջին թվանշանը.
     *
     * @param number;
     */
    void theFirstDigit(int number) {
        for (int i = number; i > 0; i = i / 10) {
            if (i <= 9) {
                System.out.println(i);
            }
        }
    }

    /**
     * 13. Տրված են int x = 1, int y = 0.  Քանի դեռ x < 5 ից  և  y < 10  տպել  x+y արտահայտությունը․
     * @return sum;
     */
    int sum() {
        int x = 1;
        int y = 0;
        int sum = 0;
        while (x < 5 & y < 10) {
            System.out.println(sum);
            x++;
            y++;
            sum = x + y;
        }
        return sum;
    }

    /**
     * 14. Գրել method, որը console -ում տպում է քառակուսի, օգտագործեք * սիմվոլը։
     *
     * @param side;
     */
    void squareWithSymbol(char side) {
        for (int i = 0; i < 30; i++) {
            System.out.print('*');
            System.out.println();
            for (int j = 0; j < 30; j++) {
                System.out.print('*');
            }
        }
    }

    /**
     * 15․ Գրել method, որը console -ից ստանում է N թիվը և հաշվում է [1-N] բոլոր 5-ի բաժանվող թվերի գումարը։
     *
     * @param number;
     */
    void sumOfTheNumbersDivisibleBy5(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 5 == 0) {
                sum += i;
                System.out.println(sum);
            }
        }
    }

    /**
     * 8. Գրել method, որը հաշվում է [1-N]  բոլոր  երկնիշ զույգ թվերի արտադրյալը։
     *
     * @param number;
     * @return multiple;
     */
    long multiplicationForPairNumbers(int number) {
        long multiple = 1;
        for (int i = 1; i <= number; i++) {
            if (i >= 10 & i <= 99) {
                multiple = multiple * i;
            }
        }
        System.out.println(multiple);
        return multiple;
    }

    /**
     * 9․ Գրել method, որը [1-N] հաջորդական  թվերի մեջ գտնում է
     * մեծագույն և փոքրագույն տարրերը և հաշվում նրանց թվաբանական միջինը։
     *
     * @param number;
     * @return ArithmeticMain;
     */
    int theArithmeticMainOftheMaxAndMinValues(int number) {
        int ArithmeticMain = (1 + number) / 2;
        System.out.println(ArithmeticMain);
        return ArithmeticMain;
    }

    /**
     * 10․ Գրել method, որը ստանում է 5 - անիշ ամբողջ թիվ և հաշվում  այդ թվի թվանշանների գումարը:
     * @return sum;
     */
    int sumOfTheDigits() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five-digit number to calculate the sum of the digits ");
        int number = input.nextInt();
        int sum = 0;
        int digit;
        for (int i = number; i > 0; i = i / 10) {
            digit = number % 10;
            number = number / 10;
            sum += digit;
        }
        System.out.println("The sum of the digits of the entered number is equal " + sum);
        return sum;
    }

    public static void main(String[] args) {
        StatementsHomework myStatementsHomwork = new StatementsHomework();
//        myStatementsHomwork.pairOrOdd(-8);
//        myStatementsHomwork.positiveOrNegative(17);
//        myStatementsHomwork.bigOrSmall(20);
//        myStatementsHomwork.divisionBy5To7(40);
//        myStatementsHomwork.threeDigitNumber(846);
//        myStatementsHomwork.inInside(5, 7);
//        myStatementsHomwork.maxElement(-54, 223, 7);
//        myStatementsHomwork.leapYear(2013);
//        myStatementsHomwork.printNumber();
//        myStatementsHomwork.theTrue();
//        myStatementsHomwork.theTrue2();
//        myStatementsHomwork.theNumbers();
//        myStatementsHomwork.theFirstDigit(7498);
//        myStatementsHomwork.sum();
//        myStatementsHomwork.squareWithSymbol('*');
//        myStatementsHomwork.sumOfTheNumbersDivisibleBy5(23);
//        myStatementsHomwork.multiplicationForPairNumbers(14);
//        myStatementsHomwork.theArithmeticMainOftheMaxAndMinValues(5);
        myStatementsHomwork.sumOfTheDigits();
    }
}
