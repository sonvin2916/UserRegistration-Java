package com.uservalidate;

import java.util.regex.Pattern;

public class UserValidate
{
    private static final String FIRST_NAME="^[A-Z]{1}[a-z]{2,}$";

    public boolean validateFirstName(String fname)
    {
        Pattern pattern = Pattern.compile(FIRST_NAME);
        return pattern.matcher(fname).matches();
    }

}