package org.example.homeworks.abstract_class_and_interface.problem_2;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("We draw a circle.");
    }

    @Override
    public void erase() {
        System.out.println("We erase the circle");
    }
}
