package com.pb.grigoreva.hw8;

public class WrongPasswordException extends Exception {

        private final double password;

        public WrongPasswordException (double password) {
            this.password = password;
        }

    public double getPassword() {

            return password;
    }
}
