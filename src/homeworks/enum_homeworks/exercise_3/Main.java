package homeworks.enum_homeworks.exercise_3;

public class Main {
    public static void main(String[] args) {
        Area area = new Area(Shapes.SQUARE);
        Area area1 = new Area(Shapes.TRIANGLE);
        Area area2 = new Area(Shapes.RECTANGLE);
        Area area3 = new Area(Shapes.CIRCLE);
        area.areaShapes();
        area1.areaShapes();
        area2.areaShapes();
        area3.areaShapes();
    }
}
