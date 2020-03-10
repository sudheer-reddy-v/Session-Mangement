package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {
	
		@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
	        String details ="";
	        ErrorResponse error = new ErrorResponse("400", details);
	        return new ResponseEntity<Object>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	
	
}



