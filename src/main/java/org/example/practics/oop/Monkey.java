package org.example.practics.oop;

public class Monkey extends Animal{
    public String getParentId(){
        return super.id;
    }
    String fly(){
        System.out.println("Monkey's flying:");
        return "flyng mokey";
    }
}
