package com.bankapp.controllers;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bankapp.dto.ErrorInfoDto;
import com.bankapp.exceptions.BankAccountNotFoundException;

@RestControllerAdvice
public class ExHandlerController {

	@ExceptionHandler(BankAccountNotFoundException.class)
	public ResponseEntity<ErrorInfoDto> handle404(BankAccountNotFoundException ex){
		ErrorInfoDto dto=new ErrorInfoDto();
		dto.setMessage(ex.getMessage());
		dto.setTimeStamp(LocalDateTime.now());
		dto.setStatusCode(HttpStatus.NOT_FOUND.value());
		dto.setToContact("raj@oracle.com");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(dto);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorInfoDto> handle500(Exception ex){
		ErrorInfoDto dto=new ErrorInfoDto();
		dto.setMessage("some internal error");
		dto.setTimeStamp(LocalDateTime.now());
		dto.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		dto.setToContact("raj@oracle.com");
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(dto);
	}
}
