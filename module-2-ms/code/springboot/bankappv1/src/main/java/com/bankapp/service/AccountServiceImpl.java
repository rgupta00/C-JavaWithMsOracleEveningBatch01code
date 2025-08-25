package com.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.dto.AccountContactDetailsDto;
import com.bankapp.entities.Account;
import com.bankapp.exceptions.BankAccountNotFoundException;
import com.bankapp.repo.AccountRepo;
@Service
@Transactional
//declartive tx mgt ACID
public class AccountServiceImpl implements AccountService{

	private AccountRepo accountRepo;
	
	@Autowired
	public AccountServiceImpl(AccountRepo accountRepo) {
		this.accountRepo = accountRepo;
	}

	@Override
	public List<Account> getAll() {
		return accountRepo.findAll();
	}

	@Override
	public Account getById(int id) {
		return accountRepo.findById(id)
				.orElseThrow(()->new BankAccountNotFoundException("bank account with id "+id +" is not found"));
	}

	@Override
	public void addAccount(Account account) {
		accountRepo.save(account);
	}

	@Override
	public void deleteAccount(int id) {
		Account accountToDelete= getById(id);
		accountRepo.delete(accountToDelete);
	}

	@Override
	public void updateAccount(int accId, AccountContactDetailsDto accountContactDetails) {
		Account accountToUpdate= getById(accId);
		accountToUpdate.setEmail(accountContactDetails.getEmail());
		accountToUpdate.setPhone(accountContactDetails.getPhone());
		accountRepo.save(accountToUpdate);
	}

	@Override
	public void transfer(int fromAccId, int toAccId, BigDecimal amount) {
		Account fromAcc=getById(fromAccId);
		Account toAcc=getById(toAccId);
		
		fromAcc.setBalance(fromAcc.getBalance().subtract(amount));
		
		toAcc.setBalance(toAcc.getBalance().add(amount));
		
		accountRepo.save(fromAcc);
		
		accountRepo.save(toAcc);
	}

	@Override
	public void deposit(int accId, BigDecimal amount) {
		Account acc=getById(accId);
		acc.setBalance(acc.getBalance().add(amount));
		accountRepo.save(acc);
	}

	@Override
	public void withdraw(int accId, BigDecimal amount) {
		Account acc=getById(accId);
		acc.setBalance(acc.getBalance().subtract(amount));
		accountRepo.save(acc);
	}

}
