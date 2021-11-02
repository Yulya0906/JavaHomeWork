package com.pb.grigoreva.hw5;

@SuppressWarnings("unused")
public class Book {
    public static int getBookCount () {
        return bookCount;
    }
    private String title;
    private String author;
    private String year;
    private static int bookCount = 0;
    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
        bookCount++;
    }
    public Book() {
        this.title = title;
        bookCount++;
    }
    public String getTitle () {
        return title;}

    public void setTitle (String title) {this.title = title;}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public static void setBookCount(int bookCount) {
        Book.bookCount = bookCount;
    }


}
