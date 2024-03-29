package org.example;

import org.apache.commons.lang3.StringUtils;

public class PasswordChecker {
    public boolean checkPassword(String password){

        if (password.length() < 7 && password.length() > 12)
            return false;
        if (!StringUtils.isMixedCase(password))
            return false;

        if (password.contains("password"))
            return false;

        return true;
    }
}
