package com.lcwd.hotel.service.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String, Object>> handleResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
		String msg = resourceNotFoundException.getMessage();
		Map<String, Object> map = new HashMap<>();
		map.put("message", resourceNotFoundException.getMessage());
		map.put("status", HttpStatus.NOT_FOUND);
		map.put("success", false);
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		
	}
}
