package org.example.homeworks.algorithms.algorithmic_exercises;

import java.util.Scanner;

public class NDegreeN {

    /**
     * This method rotates by printing N times N degrees "I am not left out."
     */
    void nDegreeN() {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int count = n;
        int sum = n;
        while (count > 1) {
            sum = sum * n;
            count--;
        }
        System.out.println(n + " to the powers of " + n + " equals " + Math.pow(n, n));
        for (int i = 1; i <= sum; i++) {
            System.out.println("I'm not left out․ " + i);
        }
    }

    /**
     * This method rotates by printing N times N degrees "I am not left out."
     *
     * @param m;
     * @param n;
     * @author Manuk;
     */
    void nthRecursion(int m, int n) {
        if (n > 0) {
            for (int i = 0; i < m; ++i) {
                nthRecursion(m, n - 1);
            }
        } else {
            System.out.println("Vochmek durs chi mnacel :)");
        }
    }


    /**
     * This method rotates by printing N times N degrees "I am not left out."
     *
     * @param n;
     * @param m;
     * @return sum;
     * @author Arman;
     */
    long n_to_the_power_of_m(int n, int m) {
        if (m == 0) return 1;
        long sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += n_to_the_power_of_m(n, m - 1);
        }
        return sum;
    }


    public static void main(String[] args) {
        NDegreeN obj = new NDegreeN();
        obj.nDegreeN();
//        obj.nthRecursion(3, 3);
//        System.out.print(obj.n_to_the_power_of_m(3, 3));


//        եթե պահանջ չլիներ, որ հավելյալ ֆունկցիա չենք կարող գրել, սա կլիներ
//        Scanner myScanner = new Scanner(System.in);
//        int n = myScanner.nextInt();
//        for (int i = 1; i <= Math.pow(n, n); i++) {
//            System.out.println("I'm not left out․ " + i);
//        }
    }
}
