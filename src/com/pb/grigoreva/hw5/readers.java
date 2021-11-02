package com.pb.grigoreva.hw5;

public class readers {
    public static void main(String[] args) {
        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();
        Reader reader4 = new Reader();
        Reader reader5 = new Reader();

        reader1.setName("Иванов Иван Иванович");
        reader2.setNumber("125479");
        reader3.setFaculty("исторический");
        reader4.setDate("25.07.1988");
        reader5.setTel("380974582525");
        System.out.println(reader1.getName());
        System.out.println(reader2.getName());
        System.out.println(reader3.getFaculty());
        System.out.println(reader4.getDate());
        System.out.println(reader5.getTel());


    }
}
