package com.capgemini;

public class MMCurrentAccount extends CurrentAccount {

	public MMCurrentAccount(String accountHolderName, double accountBalance,
			double creditLimit) {
		super(accountHolderName, accountBalance, creditLimit);
		
	}

	@Override
	public void withdraw(double withdrawamount) throws InsufficientFundsException {
		if((getAccountBalance()+ getCreditLimit())>withdrawamount)
			setAccountBalance(getAccountBalance() - withdrawamount);
		else
			if(withdrawamount<=0)
				throw new InvalidInputException("Invalid Amount");
			else
				throw new InsufficientFundsException("insufficient funds");
			
		
	}

}
