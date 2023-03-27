package org.example.homeworks.collections.list.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    String name;
    List<Books> books = new ArrayList<>();

    /**
     * This method searches for a book by title and author.
     *
     * @param title;
     * @param author;
     * @return is it found;
     */
    public Books searchBook(String title, String author) {
        try {
            for (Books item : books) {
                if (item.getAuthor().equals(author) && item.getTitle().equals(title)) {
                    return item;
                }
            }
            throw new Exception("This book don't found.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     * This method add a book.
     *
     * @param book;
     */
    public void addBook(Books book) {
        books.add(book);
    }

    /**
     * This method display all books.
     */
    public void displayingBook() {
        for (Books book : books) {
            System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getPublisher() + " " + book.getYearOfPublishing() + " " + book.getISBN());
        }
    }

    /**
     * This method delete a book.
     *
     * @param book;
     */
    public void deleteBook(Books book) {
        try {
            for (Books item : books) {
                if (item.equals(book)) {
                    books.remove(book);
                }
            }
            throw new Exception("This book don't found.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void deleteBook(String title) {
        try {
            for (Books item : books) {
                if (item.equals(title)) {
                    books.remove(title);
                }
            }
            throw new Exception("This book don't found.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
