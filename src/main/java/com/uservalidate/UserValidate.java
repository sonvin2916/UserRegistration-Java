package com.uservalidate;

import javafx.scene.control.cell.ProgressBarTreeTableCell;

import java.util.regex.Pattern;

public class UserValidate
{
    private static final String FIRST_NAME="^[A-Z]{1}[a-z]{2,}$";
    private static final String LAST_NAME="^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_PATTERN="^[a-zA-Z0-9._%+-]+\\@[a-zA-Z0-9]+\\.[A-Za-z]{2,6}$";
    private static final String MOBILE_PATTERN="^[0-9]{2}[[ ]][0-9]{10}$";
    private static final String PASSWORD_MINEIGHT_CHARACTERS="([a-zA-Z0-9@#!]){8,}$";
    private static final String PASSWORD_UPPER_CASE="^([a-z0-9@#!]*)[A-Z]+([a-z0-9@#!]*)$";
    private static final String PASSWORD_NUMERIC_PATTERN="^([a-zA-Z@#!]*[0-9]+[a-zA-Z@#!]*)$";
    private static final String PASSWORD_SPECIAL_CHARACTER="([a-zA-Z0-9]*)[^a-zA-Z_0-9\\s]([a-zA-Z0-9]*)$";
    private static final String PASSWORD_PATTERN="^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})$";

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
    public boolean validateUpperCase(String password)
    {
        Pattern pattern = Pattern.compile(PASSWORD_UPPER_CASE);
        return pattern.matcher(password).matches();
    }
    public boolean validateNumeric(String password)
    {
        Pattern pattern = Pattern.compile(PASSWORD_NUMERIC_PATTERN);
        return pattern.matcher(password).matches();
    }
    public boolean validateSpecialCharacter(String password)
    {
        Pattern pattern =  Pattern.compile(PASSWORD_SPECIAL_CHARACTER);
        return pattern.matcher(password).matches();
    }
    public boolean validateEmailSample(String password)
    {
        Pattern pattern= Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }

}