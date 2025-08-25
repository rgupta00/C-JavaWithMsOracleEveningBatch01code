package com.bankapp.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorInfoDto {
	private String message;
	private String toContact;
	private int statusCode;
	private LocalDateTime timeStamp ;
}
