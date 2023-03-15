package org.example.practics;

import java.math.BigInteger;

public class Multiple {
    /*1-N թվերի արտադրյալը պահել հիշողության մեջ*/
    public static void main(String[] args) {

        BigInteger mul = new BigInteger("1");
        for (int i = 10; i <= 99; i++) {
            if (i % 2 == 0) {
                mul = mul.multiply(BigInteger.valueOf(i));
            }
        }
    }
}
