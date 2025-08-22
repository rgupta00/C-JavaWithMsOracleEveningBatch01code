package com.productapp;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.dao.Product;
import com.productapp.dao.ProductRepo;

@SpringBootApplication
public class Productappv1Application implements CommandLineRunner{

	@Autowired
	private ProductRepo productRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Productappv1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepo.save(new Product("dell laptop", BigDecimal.valueOf(45000)));
		productRepo.save(new Product("laptop stand", BigDecimal.valueOf(450)));
		
		
	}

}
