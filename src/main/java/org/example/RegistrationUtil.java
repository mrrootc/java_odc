package org.example;

public class RegistrationUtil {
    boolean ValidateUserInput(String nomUser, String password, String confirmPassword) {
        if (nomUser.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            return false;
        }
        if (!password.equals(confirmPassword)) {
            return false;
        } else {
            return true;
        }
    }
}