package com.pb.grigoreva.hw8;

public class WrongconfirmPasswordException extends Exception {

        private final double confirmpassword;

        public WrongconfirmPasswordException (double confirmpassword) {
            this.confirmpassword = confirmpassword;
        }

    public double getConfirmpassword() {
        return confirmpassword;
    }
}
