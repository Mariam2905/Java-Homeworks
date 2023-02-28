package homeworks.abstract_class_and_interface.problem_2;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("We draw a square.");
    }

    @Override
    public void erase() {
        System.out.println("We erase the square");
    }
}