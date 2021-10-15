package com.pb.grigoreva.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Пожайлуста введите число из диапазона от 0 до 100");
        x = scan.nextInt();
        if (x>=0) {
            if (x<=14) {
                System.out.println ( "диапазон [0-14]");
            }
            if (x>=15 | x<=35) {
                System.out.println ( "диапазон [15-35]");
            }
            if (x>=36 | x<=50) {
                System.out.println ( "диапазон [36-50]");
            }
            if (x>=51 | x<=100) {
                System.out.println ( "диапазон [51-100]");
            }
            if (x<0 | x>100) {
                System.out.println ( "Ошибка выберите число из диапазона");
        }}
}}