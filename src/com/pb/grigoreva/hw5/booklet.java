package com.pb.grigoreva.hw5;

public class booklet {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3;
        book3 = new Book();

        book1.setTitle("Перси Джексон и похититель молний");
        book2.setAuthor("Рик Реордан");
        book3.setYear("2010");
        System.out.println(book1.getTitle());
        System.out.println(book2.getAuthor());
        System.out.println(book3.getYear());

    }
}
