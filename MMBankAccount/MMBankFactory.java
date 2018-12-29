package com.capgemini;

public class MMBankFactory extends BankFactory {

	@Override
	public  MMCurrentAccount getNewCurrentAccount(String accountHolderName,
			double accountBalance, double creditLimit) {
		
		return new MMCurrentAccount(accountHolderName,accountBalance,creditLimit);
	}

	@Override
	public MMSavingsAccount getNewSavingAccount(String accountHolderName,
			double accountBalance, boolean isSalary) {
		
		return new MMSavingsAccount(accountHolderName, accountBalance,isSalary);
	}

	/*@Override
	public MMCurrentAccount getNewCurrentAccount(String accountHolderName,
			double accountBalance, double creditLimit) {
		
		return new MMCurrentAccount(accountHolderName,accountBalance,creditLimit);
	}

	@Override
	public MMSavingsAccount getNewSavingAccount(String accountHolderName,
			double accountBalance, boolean isSalary) {
		
		return new MMSavingsAccount(accountHolderName, accountBalance,isSalary);
	}*/

	
}
