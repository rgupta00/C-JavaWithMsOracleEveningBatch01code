package com.productapp.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.productapp.dao.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
	private String error;
	private String toContact;
	private int statusCode;
	private LocalDateTime timeStamp;
	
}
