package org.example.homeworks.collections.list.library;

public class Books {

    private String title;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private long ISBN;

    public Books(String title, String author, String publisher, int yearOfPublishing, long ISBN) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public long getISBN() {
        return ISBN;
    }

    public String toString() {
        return "Title= " + title + " Author= " + author + " Publisher= " + publisher + " Year of publishing= " + yearOfPublishing + " ISBN= " + ISBN;
    }
}
