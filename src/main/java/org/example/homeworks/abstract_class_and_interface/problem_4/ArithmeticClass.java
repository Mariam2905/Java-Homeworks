package org.example.homeworks.abstract_class_and_interface.problem_4;

public class ArithmeticClass implements Test {
    int number = 3;

    @Override
    public void square() {
        double result = Math.pow(number, 2.0);
        System.out.println(result);
    }
}
