package com.bankapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dto.FundDepositDto;
import com.bankapp.dto.FundTransferDto;
import com.bankapp.dto.FundWithdrawDto;
import com.bankapp.service.AccountService;

@RestController
@RequestMapping(path="accountapp/api/transactions/")
public class AccountTxController {

	private AccountService accountService;

	@Value("${BANK.MESSAGE.FUND_TRANDFER}")
	private String transferMessage;
	
	@Autowired
	public AccountTxController(AccountService accountService) {
		this.accountService = accountService;
	}

	// Transfer
	@PostMapping("transfer")
	public ResponseEntity<String> tranfer(@RequestBody FundTransferDto fundTransferDto) {
		
		accountService.transfer(fundTransferDto.getFromAccId(), fundTransferDto.getToAccId(),
				fundTransferDto.getAmount());

		return ResponseEntity.status(HttpStatus.CREATED).body(transferMessage);
	}

	// deposit
	@PostMapping("deposit")
	public ResponseEntity<String> deposit(@RequestBody FundDepositDto fundDepositDto) {
		accountService.deposit(fundDepositDto.getAccId(), fundDepositDto.getAmount());
		return ResponseEntity.status(HttpStatus.CREATED).body("deposit happens successfully");
	}

	// withdaraw
	@PostMapping("withdraw")
	public ResponseEntity<String> withdraw(@RequestBody FundWithdrawDto fundwithdrawDto) {
		accountService.withdraw(fundwithdrawDto.getAccId(), fundwithdrawDto.getAmount());
		return ResponseEntity.status(HttpStatus.CREATED).body("withdraw happens successfully");
	}

}
