package com.junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author Kapil
 *
 */
public class UserRegistrationTest {
	 UserRegistration userRegistration = new UserRegistration();
	 
        /*
         * User need to a valid first name
         */
	    @Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.firstName("Kapil");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.firstName("kapil");
	        Assert.assertEquals(false, result);
	    }

}
