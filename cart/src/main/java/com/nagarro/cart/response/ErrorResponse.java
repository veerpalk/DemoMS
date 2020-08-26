package com.nagarro.cart.response;

import org.springframework.http.HttpStatus;

public class ErrorResponse {

	private String message;
	private HttpStatus statusCode;

	public ErrorResponse(String message, String statusCode) {
		this.message = message;
		this.statusCode = HttpStatus.valueOf(statusCode);
		;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return statusCode;
	}

	public void setStatus(HttpStatus status) {
		this.statusCode = status;
	}

}
