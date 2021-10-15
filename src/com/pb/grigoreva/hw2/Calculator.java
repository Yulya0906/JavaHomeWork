package com.pb.grigoreva.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // char grade = args [0] .charAt (0);
        char num = 'D';
        Scanner scan = new Scanner(System.in);
        int x ;
        int y;
        x = scan.nextInt() ;
        y = scan.nextInt() ;
        switch (num) {
            case  'A' :
                System.out.println( "(x+y)=" +(x+y));
                break;
            case  'B' :
                System.out.println("(x-y)=" +(x-y));
                break;
            case  'C' :
                System.out.println("(x*y)=" +(x*y));
                break;
            case  'D' :
                if (y<0 | y<0) {
                    System.out.println("(x/y)=" +(x/y));}
                if (y == 0) {
                    System.out.println( "делить на ноль нельзя");}
                    break;

                }

    }
}
