package com.lcwd.hotel.service.exception;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
	
	
	public ResourceNotFoundException() {
		super("Resource Not found");
	}
}
