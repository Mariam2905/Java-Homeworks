package homeworks.enum_homeworks.enum1.exercise_3;

/**
 * This method calculate the areas of shapes.
 */
public class Area {
    Shapes area;
    //հարց խի եմ ընկնում անընդհատ ֆունկցիայի մեջ՞՞՞
//    Scanner myScanner = new Scanner(System.in);
//    double side = myScanner.nextDouble();
//    double basis = myScanner.nextDouble();
//    double height = myScanner.nextDouble();
//    double width = myScanner.nextDouble();
//    double length = myScanner.nextDouble();
//    double radius = myScanner.nextDouble();
    double side = 10.0;
    double basis = 2.0;
    double height = 3.7;
    double width = 4.0;
    double length = 5.1;
    double radius = 7.3;
    double pi = Math.PI;

    public Area(Shapes area) {
        this.area = area;
    }

    public void Square(double side) {
        this.side = side;
    }

    double getAreaSquare() {
        return side * side;
    }

    public void Triangle(double basis, double height) {
        this.basis = basis;
        this.height = height;
    }

    double getAreaTriangle() {
        return basis * height / 2;
    }

    public void Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getAreaRectangle() {
        return length * width;
    }

    public void Circle(double radius) {
        this.radius = radius;
    }

    double getAreaCircle() {
        return radius * radius * pi;
    }

    public void areaShapes() {
        switch (area) {
            case SQUARE:
                System.out.println("The area of the square is։ " + getAreaSquare());
                break;
            case TRIANGLE:
                System.out.println("The area of the triangle is։ " + getAreaTriangle());
                break;
            case RECTANGLE:
                System.out.println("The area of the rectangle is։ " + getAreaRectangle());
                break;
            case CIRCLE:
                System.out.println("The area of the circle is։ " + getAreaCircle());
                break;
            default:
                System.out.println("Unknown shape.");
                break;
        }
    }
}
