package com.bankapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.entities.Account;
import com.bankapp.service.AccountService;

@RestController
@RequestMapping(path="accountapp/api/crud")
public class AccountCrudController {

	private AccountService accountService;

	@Autowired
	public AccountCrudController(AccountService accountService) {
		this.accountService = accountService;
	}
	//get all
	@GetMapping(path="accounts")
	public ResponseEntity<List<Account>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(accountService.getAll());
	}
	
	//get one by id
	
	@GetMapping(path="accounts/{id}")
	public ResponseEntity<Account> getById(@PathVariable("id") int id){
		return ResponseEntity.status(HttpStatus.OK).body(accountService.getById(id));
	}
	
	//add 
	@PostMapping(path="accounts")
	public ResponseEntity<String> addAccount(@RequestBody Account account){
		accountService.addAccount(account);
		return ResponseEntity.status(HttpStatus.CREATED).body("account is created with "+ account.getId());
	}
	
	//update
	
	//delete
	
	//
}
