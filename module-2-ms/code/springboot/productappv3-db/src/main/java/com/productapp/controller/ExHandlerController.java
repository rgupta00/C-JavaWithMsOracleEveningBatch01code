package com.productapp.controller;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.productapp.dto.ErrorMessage;
import com.productapp.exceptions.ProductNotFoundException;

@RestControllerAdvice //ex handling
public class ExHandlerController {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorMessage> handle404(ProductNotFoundException ex) {
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setError(ex.getMessage());
		errorMessage.setToContact("raj@oracle.com");
		errorMessage.setTimeStamp(LocalDateTime.now());
		errorMessage.setStatusCode(HttpStatus.NOT_FOUND.value());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
	}
	//MethodArgumentNotValidException
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorMessage> handle400(MethodArgumentNotValidException ex) {
		
		String errMessageString= ex.getBindingResult()
				.getAllErrors()
				.stream()
				.map(x-> x.getDefaultMessage())
				.collect(Collectors.joining(" ,"));
				
		
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setError(errMessageString);
		errorMessage.setToContact("raj@oracle.com");
		errorMessage.setTimeStamp(LocalDateTime.now());
		errorMessage.setStatusCode(HttpStatus.BAD_REQUEST.value());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
	}
	
	
	//generic handler
	//@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> handle500(Exception ex) {
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setError("pls try after some time");
		errorMessage.setToContact("raj@oracle.com");
		errorMessage.setTimeStamp(LocalDateTime.now());
		errorMessage.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
	}
}
