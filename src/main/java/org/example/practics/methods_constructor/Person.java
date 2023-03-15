package org.example.practics.methods_constructor;

public class Person {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String firstName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String firstName, lastName, mail;
    private int age;
    private double speed;

    public Person(String firstName, String lastName, String mail, int age, double speed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.age = age;
        this.speed = speed;
    }

    public void speak() {
        System.out.println("I am speaking");
    }

    public Person() {

    }

    public double run() {
        if (age > 25) {
            speed *= +2;
            System.out.println("Speed: " + speed);
            return speed;
        } else {
            System.out.println("Speed: " + speed);
        }
        return speed;
    }

    public static void main(String[] args) {
        Person person = new Person("Mariam", "Avetisyan", "avetisyanmariam1990@gmail.com", 32, 7.5);
        person.run();
    }
}
