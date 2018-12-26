package com.capgemini;

public class SavingsAccount
{
	private static int accountNumber;
	private static double accountBalance;
	private String accountHolderName;
	
	public static double getAccountBalance()
	{
		return accountBalance;
	}
	
	public static void setAccountBalance(double accountBalance)
	{
		SavingsAccount.accountBalance = accountBalance;
	}

	static 
	{
		accountNumber = 1000;
	}
	
	{
		accountNumber++;
	}
	
	public static int getAccountNumber()
	{
		return accountNumber;
	}
	
	public SavingsAccount(String accountHolderName, double accountBalance)
	{
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
	}
	
	public double withdrawAmount(double amount)
	{
		if(amount<accountBalance)
		{
			accountBalance=accountBalance-amount;
			return accountBalance;
		}
		else
		{
			return accountBalance;
		}
	}
	
	public double depositAmount(double amount)
	{
		return accountBalance+amount;
    }
}