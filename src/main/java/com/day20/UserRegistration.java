package com.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;

/**
 * 
 * @author Kapil
 *
 */
public class UserRegistration {
	
	/*
	 * uc-10
	 * Junit Test to validate the user entry
	 */
	 private static final String NAME = "^[A-Z]{1}[a-z]{2,}$";
	    private static final String EMAIL = "^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$";
	    private static final String PHONE_NUMBER = "^[\\d]{2}[\\s][\\d]{10}$";
	    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$";

	    public boolean firstNameValidate(String fName)
	    {
	        return Pattern.matches(NAME, fName);
	    }
	    public boolean lastNameValidate(String lName)
	    {
	        return Pattern.matches(NAME, lName);
	    }

	    public boolean emailValidate(String email)
	    {
	        return Pattern.matches(EMAIL, email);
	    }

	    public boolean phoneNumberValidate(String phNum)
	    {
	        return Pattern.matches(PHONE_NUMBER, phNum);
	    }

	    public boolean passwordValidate(String pw)
	    {
	        return Pattern.matches(PASSWORD, pw);
	    }

}
