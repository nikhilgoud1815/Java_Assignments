package com.capgemini;

public class MMSavingsAccount extends SavingsAccountAbstract {

	private static final double minimumBalance=100;
	public MMSavingsAccount(String accountHolderName, double accountBalance,
				boolean isSalary) {
			super(accountHolderName, accountBalance, isSalary);
		
		}


	
	

	@Override
	public void withdraw(double withdrawamount) throws Exception {
		if(getAccountBalance()>=withdrawamount)
			setAccountBalance(getAccountBalance() - withdrawamount);
		else if(withdrawamount<=0)
			throw new InvalidInputException("Invalid Amount");
		else
			throw new InsufficientFundsException("insufficient funds");
		
	}

	@Override
	public String toString() {
		return "MMSavingAccount [toString()=" + super.toString()
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
