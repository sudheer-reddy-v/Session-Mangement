package com.example.demo.exception;

public class ErrorResponse {

	
	private String message;
	private String errorCode;
	
	public ErrorResponse(String message, String errorCode) {
        super();
        this.message = message;
        this.errorCode = errorCode;
    }
 
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	
}
