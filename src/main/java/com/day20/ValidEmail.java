package com.day20;

import java.util.regex.Pattern;

/**
  *
  *@author Kapil
  *
  **/
public class ValidEmail
{
    //method to use valid emailId
    public boolean validateEmail(String email)
    {
        return Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
    }
}
