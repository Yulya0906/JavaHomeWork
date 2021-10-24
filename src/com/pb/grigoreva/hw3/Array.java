package com.pb.grigoreva.hw3;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // На 9 строке создаем массив целочисленных элементов с именем array размерностью в 10 элементов

        int[] array = new int[] {-1,7,3,5,-9,6,4,-8,1,2};
        array[0] = -1;
        array[1] = 7;
        array[2] = 3;
        array[3] = 5;
        array[4] = -9;
        array[5] = 6;
        array[6] = 4;
        array[7] = -8;
        array[8] = 1;
        array[9] = 2;
        System.out.println("В массиве " + Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println("Array Sum = "+sum);
        int counter = 0 ;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter++;
            }
        }
        System.out.println(counter + " положительных элементов");
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        }

    }



