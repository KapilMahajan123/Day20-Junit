package com.day20;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
  *
  *@author Kapil
  *
  **/
public class UserRegistrationTest {
	/**
	  * code to use lambda function
	  * To validate user entry
	  * FirstName, LastName, Email, Mobile and Password
	  **/
	UserRegistration userRegistration = new UserRegistration(); //creat an object
	Function<List<String>, List<Boolean>> firstNameTestCases = cases -> cases.stream().map(x -> {
		try {
			return userRegistration.firstNameValidate.userEntries(x);
		} catch (InvalidUserInputException e) {
			// TODO Auto-generated catch block

		}
		return false;
	}).collect(Collectors.toList());

	Function<List<String>, List<Boolean>> lastNameTestCases = cases -> cases.stream().map(x -> {
		try {
			return userRegistration.lastNameValidate.userEntries(x);
		} catch (InvalidUserInputException e) {
			// TODO Auto-generated catch block

		}
		return false;
	}).collect(Collectors.toList());

	Function<List<String>, List<Boolean>> emailTestCases = cases -> cases.stream().map(x -> {
		try {
			return userRegistration.emailValidate.userEntries(x);
		} catch (InvalidUserInputException e) {
			// TODO Auto-generated catch block

		}
		return false;
	}).collect(Collectors.toList());

	Function<List<String>, List<Boolean>> phoneTestCases = cases -> cases.stream().map(x -> {
		try {
			return userRegistration.phoneNumberValidate.userEntries(x);
		} catch (InvalidUserInputException e) {
			// TODO Auto-generated catch block

		}
		return false;
	}).collect(Collectors.toList());

	Function<List<String>, List<Boolean>> passwordTestCases = cases -> cases.stream().map(x -> {
		try {
			return userRegistration.passwordValidate.userEntries(x);
		} catch (InvalidUserInputException e) {
			// TODO Auto-generated catch block

		}
		return false;
	}).collect(Collectors.toList());

	@Test
	public void test_firstName_Cases() {
		List<Boolean> result = firstNameTestCases.apply(Arrays.asList("Kapil"));
		List<Boolean> expected = Arrays.asList(true);
		assertEquals(expected, result);
	}

	@Test
	public void test_lastName_Cases() {
		List<Boolean> result = lastNameTestCases.apply(Arrays.asList("Mahajan"));
		List<Boolean> expected = Arrays.asList(true);
		assertEquals(expected, result);
	}

	@Test
	public void test_email_Cases() {
		List<Boolean> result = emailTestCases.apply(Arrays.asList("abc@1.com"));
		List<Boolean> expected = Arrays.asList(true);
		assertEquals(expected, result);
	}

	@Test
	public void test_phoneNumber_Cases() {
		List<Boolean> result = phoneTestCases.apply(Arrays.asList("91 7798655562"));
		List<Boolean> expected = Arrays.asList(true);
		assertEquals(expected, result);
	}

	@Test
	public void test_password_Cases() {
		List<Boolean> result = passwordTestCases.apply(Arrays.asList("Kapilm@1995"));
		List<Boolean> expected = Arrays.asList(true);
		assertEquals(expected, result);
	}

}
