package com.productapp.dao;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DTO object

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Product  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull(message = "name must not be empty")
	private String name;
	
	@Range(message = "price should be in valid range", max = 200000, min=10)
	private BigDecimal price;

	public Product(@NotNull(message = "name must not be empty") String name,
			@Range(message = "price should be in valid range", max = 200000, min = 10) BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
}
