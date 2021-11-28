package com.pb.grigoreva.hw10;


public class NumBox <T extends Number> {
    private final T[] numbers;

    public NumBox(T[] numbers) {
        this.numbers = numbers;
    }

    public  T get(int index) { return numbers [index];}

    public int length(){
        int i = 0;
        for (T n :numbers){
            if(n == null){ break;}
        }
        return i;
    }
    public double average(){
        double average;
        int i=0;
        double sum =0;
        for (T n: numbers){
            if (n!=null){
                Double nNew;
                nNew = (Double) n;
                Double nNum = nNew;
                sum  =nNew;
                i++;
            }
            else break;
        }
        average = sum/i;
        return average;
    }

    public double sum {
        double sum = 0.0;
        for (T i : numbers)
            if (i == null) {
                sum = 0;
            } else i.doubleValue();
        return sum;
    };
    public T max(){
        T maX = numbers[0];
        for (T number : numbers)
            if (number.doubleValue() > maX.doubleValue()) {
                maX = number;
            }
        return maX;
    }
    }

