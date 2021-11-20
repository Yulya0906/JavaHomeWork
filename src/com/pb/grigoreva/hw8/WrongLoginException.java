package com.pb.grigoreva.hw8;

public class WrongLoginException extends Exception {

        private final double login;

        public WrongLoginException(double login) {

            this.login = login;
        }

        public double getLogin() {
            return login;
        }


    }
}
