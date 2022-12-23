package com.junit;

import org.junit.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Kapil
 *
 */
public class UserRegistration {
	
    @Test
    public boolean firstName(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        //create a pattern
        Pattern pattern = Pattern.compile(regex);
        //get a matcher object
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
}
