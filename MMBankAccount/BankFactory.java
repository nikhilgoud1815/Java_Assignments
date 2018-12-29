package com.capgemini;

public abstract class BankFactory {
	public abstract CurrentAccount getNewCurrentAccount(String accountHolderName,
			double accountBalance, double creditLimit);

	public  abstract SavingsAccountAbstract getNewSavingAccount(String accountHolderName,
			double accountBalance, boolean isSalary); 
	
}
