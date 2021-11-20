package com.pb.grigoreva.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner();
        System.out.println("Введите пароль для регистрации");
        String password = scan.nextLine();
        String login = scan.nextLine();
        Auth user = new Auth(String login, String password);
        try {
            user.signUp();
        } catch (WrongLoginException) {
            System.out.println("Логин может содержать только латиницу и цифры");
            System.out.println("Логин может содержать от 5 до 20 символов");
        }
        catch (WrongPasswordException) {
            System.out.println("Пароль может содержать только латиницу и цифры и нижнее подчеркивание");
            System.out.println("Пароль должен содержать от 5 символов");
        }
        System.out.println("Введите логин и пароль для авторизации");
    }
}

