package com.nagarro.books.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nagarro.books.exceptions.DataNotFoundException;
import com.nagarro.books.response.ErrorResponse;

@RestControllerAdvice
public class BooksExceptionHandler {

	@ExceptionHandler(value = DataNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleDataNotFoundException(DataNotFoundException ex) {
		ErrorResponse errorResponse=new ErrorResponse(ex.getMessage(),HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
	}

	

}
