package com.nagarro.enums;

public enum ErrorCode {
	
	NO_CONTENT("204", "No Content"),
	BAD_REQUEST("400", "Bad Request"),
	INTERNAL_SERVER_ERROR("500", "Internal Server Error"),
	INVALID_USER("401", "Ïnvalid Details");

	private String httpStatusCode;
	private String errorMessage;

	private ErrorCode(String statusCode, String errorMessage) {
		this.httpStatusCode = statusCode;
		this.errorMessage = errorMessage;
	}

	public String getStatusCode() {
		return this.httpStatusCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}
};


