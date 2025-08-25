package com.bankapp;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.entities.Account;
import com.bankapp.repo.AccountRepo;

@SpringBootApplication
public class Bankappv1Application implements CommandLineRunner{

	@Autowired
	private AccountRepo accountRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Bankappv1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		accountRepo.save(new Account("raj", 
				BigDecimal.valueOf(1000), "raj@gmail.com", "6565600500"));
		accountRepo.save(new Account("ekta", 
				BigDecimal.valueOf(1000), "ekta@gmail.com", "6765600599"));
		
	}

}
