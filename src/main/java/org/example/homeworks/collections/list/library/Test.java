package org.example.homeworks.collections.list.library;

public class Test {
    public static void main(String[] args) {
        Library library = new Library();
        Books book1 = new Books("Java", "Nakov", "ABC", 2018, 978061900);
        Books book2 = new Books("Python", "Nakov", "ABC", 2017, 978064027);
        Books book3 = new Books("Java", "Shildt", "McGraw-Hill Education", 2019, 1260440249);
        Books book4 = new Books("Clean Code", "Robert Martin", "Prentice Hall", 2020, 132350884);
        Books book5 = new Books("Introduction to Algorithms", "Thomas Cormen", "The MIT Press", 2021, 262033848);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.displayingBook();
        System.out.println(library.searchBook("Java", "Nakov"));
        library.deleteBook(book2);
        library.displayingBook();
        System.out.println();
        library.deleteBook("Python");
        library.displayingBook();
    }
}
