package com.capgemini;

public abstract class BankAccount {
	private int accountNumber;

	public int getAccountNumber() {
		return accountNumber;
	}

	private String accountName;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return "AbstractBankAccount [accountNumkber=" + accountNumber
				+ ", accountName=" + accountName + ", accountBalance="
				+ accountBalance + "]";
	}

	private double accountBalance;

	public void setAccountBalance(double d) {
		this.accountBalance = d;
	}

	public BankAccount(int accountNumber, String accountName,
			double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public abstract void withdraw(double amount) throws Exception ;

	public void deposit(float amount) {
		

	}
}
