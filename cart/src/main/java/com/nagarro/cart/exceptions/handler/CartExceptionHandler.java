package com.nagarro.cart.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nagarro.cart.exceptions.DataNotFoundException;
import com.nagarro.cart.response.ErrorResponse;

@RestControllerAdvice
public class CartExceptionHandler {

	@ExceptionHandler(value = DataNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleDataNotFoundException(DataNotFoundException ex) {
		ErrorResponse response = new ErrorResponse(ex.getMessage(), ex.getErrorCode().getStatusCode());
		return new ResponseEntity<ErrorResponse>(response, HttpStatus.BAD_REQUEST);

	}

}
