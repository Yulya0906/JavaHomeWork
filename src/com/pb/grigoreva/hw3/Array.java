package com.pb.grigoreva.hw3;

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
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);
        System.out.println(array[7]);
        System.out.println(array[8]);
        System.out.println(array[9]);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println("Array Sum = "+sum);
        int counter = 0 ;
        for (int i = 0; i<10; i++) {
            if (array[i]>0)
             counter = counter + 1;
            System.out.println("Количество положительных чисел" counter);
            break;
        }

    }

}

