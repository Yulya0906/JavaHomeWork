package com.pb.grigoreva.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Угадайте целое число в диапазоне от 0 до 100 с пяти попыток.");
        System.out.println("Для выхода из программы введите - exit.");

        final int MAX_ATTEMPT = 5;
        int attempt = 0;
        String x = "8";
        int y;
        Scanner in = new Scanner(System.in);

        while (attempt < MAX_ATTEMPT) {
            attempt++;

            System.out.println("Попытка " + attempt + ":");
            String value = in.next();
            y = Integer.parseInt(value);
            if (y > 8) {
                System.out.println("число больше загаданого числа");
            }else if (y < 8) {
                System.out.println("число меньше загаданого числа");
            } else if (y ==8)
            {System.out.println("число ровен загаданому числу");}


                if (value.equals("exit")) {
                    break;

                }

                if (!value.equals(x)) {
                    continue;
                }

                System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
                break;
            }

        }
    }
