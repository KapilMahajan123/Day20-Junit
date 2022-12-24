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
         * User need to a valid first name, last name
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
	    @Test
	    public void givenLastName_whenProper_ShouldReturnTrue() {
	    	boolean result = userRegistration.lastName("Mahajan");
	    	Assert.assertEquals(true, result);
	    }
	    @Test
	    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
	    	boolean result = userRegistration.lastName("mahajan");
	    	Assert.assertEquals(false, result);
	    }

}
