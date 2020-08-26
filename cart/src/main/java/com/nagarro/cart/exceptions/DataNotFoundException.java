package com.nagarro.cart.exceptions;

import com.nagarro.enums.ErrorCode;

public class DataNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final ErrorCode errorCode;

	public DataNotFoundException(ErrorCode errorCode) {
		super();
		this.errorCode = errorCode;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}
	

}
