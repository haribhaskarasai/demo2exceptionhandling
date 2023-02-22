package com.stg.exception;

public class EmployeeException extends RuntimeException {
	private String errorMessage;

	public EmployeeException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	@Override
	public String getMessage() {
		return errorMessage;
	}
	

}
