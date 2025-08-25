package com.bankapp.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
    private String name;
    private BigDecimal balance;
	
	private String email;
	private String phone;
	
	public Account(String name, BigDecimal balance, String email, String phone) {
		super();
		this.name = name;
		this.balance = balance;
		this.email = email;
		this.phone = phone;
	}
	
	
}
