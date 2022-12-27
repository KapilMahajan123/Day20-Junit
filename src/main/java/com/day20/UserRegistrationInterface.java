package com.day20;

/**
 * 
 * @author Kapil
 *
 */
@FunctionalInterface
public interface UserRegistrationInterface {
	public abstract boolean userEntries(String value) throws InvalidUserInputException;
}
