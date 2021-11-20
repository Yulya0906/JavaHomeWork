package com.pb.grigoreva.hw8;

import java.util.regex.Pattern;

public class Auth {

    private String password;
    private String login;
    private String Confirmpassword;
    private String confirmPassword;

    public Auth (String login, String password,String Confirmpassword)  {
       this.login = login;
       this.password = password;
       this.Confirmpassword = Confirmpassword;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getLogin() {

        return login;
    }

    public void setLogin(String login) {

        this.login = login;
    }

    public String getConfirmpassword() {

        return Confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        Confirmpassword = confirmpassword;
    }

    public void signUp() {
        throws WrongLoginException  {
            if (!Pattern.matches("[a-zA-z_0-9] {5-20}", login)) {
                this.login = login;
            }
        }
            else {
                throw new WrongLoginException ();
            }
              throws{
            if (!Pattern.matches("[a-zA-z_0-9] {5,}", password)) {
                this.password = password;
            }
            }
            else  {
                throw new WrongPasswordException();
            }
              throws WrongconfirmPasswordException {
            if (! password.equals(confirmPassword)){
         }
        }
            else {
                throw new WrongconfirmPasswordException();
            }

            System.out.println ("Поздровляем регистрация прошла успешно");
        }



