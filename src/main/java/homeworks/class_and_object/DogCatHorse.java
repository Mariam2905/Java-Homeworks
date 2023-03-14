package homeworks.class_and_object;

public class DogCatHorse {
    public static void main(String[] args) {
        Dog Bobi = new Dog();
        Bobi.speed = 25.0f;
        System.out.println(Bobi.speed);
        Cat As = new Cat();
        As.color = "gris";
        System.out.println(As.color);
        Horse Horse = new Horse();
        System.out.println(Horse.kind);
    }
}

class Dog {
    public String kind;
    public String color;
    public int weight;
    public float speed;
}

class Cat {
    public String kind;
    public String color = "black";
    public int weight;
    public float speed;
}

class Horse {
    public String kind = "wild";
    public String color;
    public int weight;
    public float speed;
}
