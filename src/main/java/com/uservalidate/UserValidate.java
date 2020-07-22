package com.uservalidate;

import java.util.regex.Pattern;

public class UserValidate
{
    private static final String FIRST_NAME="^[A-Z]{1}[a-z]{2,}$";
    private static final String LAST_NAME="^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_PATTERN="^[a-zA-Z0-9._%+-]+\\@[a-zA-Z0-9]+\\.[A-Za-z]{2,6}$";
    private static final String MOBILE_PATTERN="^[0-9]{2}[[ ]][0-9]{10}$";
    private static final String PASSWORD_MINEIGHT_CHARACTERS="^([A-Za-z0-9]){8,}$";

    public boolean validateFirstName(String fname)
    {
        Pattern pattern = Pattern.compile(FIRST_NAME);
        return pattern.matcher(fname).matches();
    }
    public boolean validateLastName(String lname)
    {
        Pattern pattern = Pattern.compile(LAST_NAME);
        return pattern.matcher(lname).matches();
    }
    public boolean validateEmail(String email)
    {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
    public boolean validateMobileNumber(String mobileNumber)
    {
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        return pattern.matcher(mobileNumber).matches();
    }
    public boolean validatePassEightCharacters(String password)
    {
        Pattern pattern = Pattern.compile(PASSWORD_MINEIGHT_CHARACTERS);
        return pattern.matcher(password).matches();
    }

}