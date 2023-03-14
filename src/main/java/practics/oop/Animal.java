package practics.oop;

public class Animal {
    private String name;
    private int age;
    public String sort;
    protected String id;
    int countOfFeet;



    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
//        return this.age;
        return age;
    }

    public Animal(int age) {
        this.age = age;
    }
    public Animal(Integer age) {
        this.age = age;
    }
    public Animal(String name, int age, int countOfFeet) {
        this.name = name;
        this.age = age;
        this.countOfFeet = countOfFeet;
    }
public Animal() {
        this.name = name;
        this.age = age;
        this.countOfFeet = countOfFeet;
    }
    String fly(){
        System.out.println("I'm flying");
        return "fly";
    }
}
