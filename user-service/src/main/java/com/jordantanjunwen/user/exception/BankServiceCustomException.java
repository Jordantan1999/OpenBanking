package com.jordantanjunwen.user.exception;

/**
 * Custom Exception class
 *
 */
public class BankServiceCustomException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	BankServiceCustomException(String message) {
		super(message);
	}
}
