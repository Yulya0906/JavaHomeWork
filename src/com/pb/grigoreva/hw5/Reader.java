package com.pb.grigoreva.hw5;

import com.sun.jnlp.PersistenceServiceNSBImpl;

import java.beans.PersistenceDelegate;

@SuppressWarnings("ALL")
public class Reader {
    private static Object ReaderCount;
    public static Object getReaderCount() {
        return ReaderCount;}
        private String name;
        private String number;
        private String faculty;
        private String date;
        private String tel;
        private static int bookCount = 0;
    public Reader(int readerCount, String name, String number, String faculty, String date, String tel) {
        ReaderCount = readerCount;
        this.name = name;
            this.number = number;
            this.faculty = faculty;
            this.date = date;
            this.tel = tel;
            bookCount++;
    }
    public Reader() {
        this.name = name;
        Object readerCount = ReaderCount;
    }

    public static void setReaderCount(Object readerCount) {
        ReaderCount = readerCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTel() {
        return tel;
    }

    public void setTel (String tel) {
        this.tel = tel;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public static void setBookCount(int bookCount) {
        Reader.bookCount = bookCount;
        Person person = new Person( "Петров А.И");

    }

    public void setDate() {
    }

    private static class Person {
    }
}



