package com.rishu.todoapplication.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResourceNotFoundException extends RuntimeException{
       
	private String message;
	private HttpStatus status;
	public ResourceNotFoundException(String message, HttpStatus status) {
		super();
		this.message = message;
		this.status = status;
	}
	

}
