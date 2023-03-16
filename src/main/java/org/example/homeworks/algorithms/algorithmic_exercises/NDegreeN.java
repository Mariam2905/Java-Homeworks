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

    public static void main(String[] args) {
        NDegreeN obj = new NDegreeN();
        obj.nDegreeN();

//        եթե պահանջ չլիներ, որ հավելյալ ֆունկցիա չենք կարող գրել, սա կլիներ
//        Scanner myScanner = new Scanner(System.in);
//        int n = myScanner.nextInt();
//        for (int i = 1; i <= Math.pow(n, n); i++) {
//            System.out.println("I'm not left out․ " + i);
//        }
    }
}
