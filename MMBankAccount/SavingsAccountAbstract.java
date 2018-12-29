package com.capgemini;

public abstract class SavingsAccountAbstract extends BankAccount {
	private boolean isSalary;
	private static final double minBalance=100;
	public SavingsAccountAbstract(String accountHolderName,
			double accountBalance, boolean isSalary) {
		super(accountHolderName, accountBalance);
		this.isSalary=isSalary;
		
	}
	
	@Override
	public abstract void withdraw(double withdrawamount) throws Exception;

	@Override
	public String toString() {
		return "SavingAccount [isSalary=" + isSalary + ", toString()="
				+ super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
