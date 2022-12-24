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
	    
	    /*
	     * User need to valid email id.
	     */
	    @Test
		public void givenEmail_WhenProper_ShouldReturnTrue() {
			boolean result = userRegistration.email("abc.xyz@bl.co.in");
			Assert.assertEquals(true, result);
		}

		@Test
		public void givenEmail_WhenNotProper_ShouldReturnFalse() {
			boolean result = userRegistration.email("abc&.com");
			Assert.assertEquals(false, result);
		}
		
		/*
		 * User need to follow Pre-defined mobile format
		 */
	    @Test
	    public void givenPhoneNumber_WhenProper_shouldReturnTrue() {
	    	 boolean result = userRegistration.mobileNumber("91 7883426320");
	    	 Assert.assertEquals(true, result);
	    }
	    @Test
	    public void givenPhoneNumber_WhenNotProper_shouldReturnFalse() {
			 boolean result = userRegistration.mobileNumber("5647891233");
			 Assert.assertEquals(false, result);
		 }
	     
	     /*
	      * User need to follow Pre-defined password 
	      * Rule-1 ---> Minimun 8 characters
	      */
	     @Test
	     public void givenPassword_WhenProper_ShouldReturnTrue(){
	    	 boolean result = userRegistration.password("Qwertyiop");
	    	 Assert.assertEquals(true, result);
	     }
	     @Test
	     public void givenPassword_WhenNotProper_ShouldReturnFalse(){
	    	 boolean result = userRegistration.password("qwertyyuuiop");
	    	 Assert.assertEquals(false, result);
	     }
	     
	     /*
	      * Rule-2 ---> Should have at least 1 upper case
	      */
	     @Test
		 public void givenPasswordRule2_WhenProper_ShouldReturnTrue(){
			 boolean result = userRegistration.password2("Qwertyu19");
			 Assert.assertEquals(true, result);
		 }
		 @Test
	     public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse(){
			 boolean result = userRegistration.password2("qwerrty");
			 Assert.assertEquals(false, result);
		 }
		 
		 /*
		  * Rule-3 ---> Should have at least 1 numeric number in the password
		  */
		 @Test
		 public void givenPasswordRule3_WhenProper_ShouldReturnTrue(){
			 boolean result = userRegistration.password3("Kapil@123");
			 Assert.assertEquals(true, result);
		 }
		 @Test
	     public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse(){
			 boolean result = userRegistration.password3("ka@mh");
			 Assert.assertEquals(false, result);
		 }

}
