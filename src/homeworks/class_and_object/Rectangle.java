package homeworks.class_and_object;

public class Rectangle {
    float length;
    float width;

    public static double calculateArea() {
        Rectangle Rectangle1 = new Rectangle();
        Rectangle1.length = 14.0f;
        Rectangle1.width = 5.0f;
        double Area = Rectangle1.length * Rectangle1.width;
        System.out.println(Area);
        return Area;
    }

    public static void main(String[] args) {
        calculateArea();
    }
}
