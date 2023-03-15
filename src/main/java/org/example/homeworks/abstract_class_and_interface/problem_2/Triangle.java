package org.example.homeworks.abstract_class_and_interface.problem_2;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("We draw a triangle.");
    }

    @Override
    public void erase() {
        System.out.println("We erase the triangle");
    }
}