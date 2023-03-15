package org.example.homeworks.class_and_object.class_and_object_2;

public class BookAndAuthor {
    public static void main(String[] args) {
        Author Jay = new Author();
        Jay.firstName = "Jay";
        System.out.println(Jay.firstName);
        Book BC = new Book();
        System.out.println(BC.Author);
    }
}
