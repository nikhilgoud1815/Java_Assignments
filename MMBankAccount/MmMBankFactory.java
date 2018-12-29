package com.capgemini;

public class MmMBankFactory extends BankFactory{
	public MMSavingsAccount getNewSavingsAccount( String accountName, double accountBalance,boolean isSalaried ) {
		return getNewSavingsAccount(accountName,accountBalance,isSalaried);
	}
	
	public MMCurrentAccount getNewCurrentAccount( String accountName, double accountBalance,boolean isSalaried ) {
		return  getNewCurrentAccount(accountName,accountBalance,isSalaried);
	}

	@Override
	public SavingsAccountAbstract getNewSavingsAccount(int accountNumber,
			String accountName, double accountBalance, boolean isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAccount getNewCurrentAccount(int accountNumber,
			String accountName, double accountBalance, boolean isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}
}
