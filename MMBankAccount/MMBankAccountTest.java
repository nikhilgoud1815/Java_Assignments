package com.capgemini;
import static org.junit.Assert.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class MMBankAccountTest {
	Logger logger = Logger.getLogger(MMBankFactory.class.getName());
	BankFactory account=new MMBankFactory();
	SavingsAccountAbstract savingaccount;
	CurrentAccount currentaccount;
	
	@Before
	public void declaringBeforeEveryMethod(){
	savingaccount=account.getNewSavingAccount("nikhil",10000.00 , true);
	currentaccount=account.getNewCurrentAccount("harish", 10000, 10000);
	BasicConfigurator.configure();
	}

	@Test
	public void accountNumberDisplayTest() {
		assertEquals(1000,savingaccount.getAccountNumber());
	}
	@Test
	public void accountHolderNameDisplayTest() {
		assertEquals("nikhil",savingaccount.getAccountHolderName());
	}
	@Test
	public void withDrawCurrentAccountTest() 
	{
		try {
			currentaccount.withdraw(15000);
			System.out.println(currentaccount.getAccountBalance());
		}
		catch (InsufficientFundsException e) {
			logger.error(e);
		}
		catch (Exception e) {
			logger.error(e);
		}
		
	}
	
	@Test
	public void depositSavingAccountTest() 
	{
		try{
			savingaccount.deposit(500);
			System.out.println(savingaccount.getAccountBalance());
		}
		catch(InvalidAmountException e)
		{
			logger.error(e);
		} 
		catch (Exception e) {
			logger.error(e);
		}
		
	}
	
	@Test
	public void depositCurrentAccountTest() 
	{
		try {
			currentaccount.deposit(150);
			System.out.println(currentaccount.getAccountBalance());
		} 
		catch(InvalidAmountException e)
		{
			logger.error(e);
		} 
		catch (Exception e) {
			logger.error(e);
		}
		
	}
	

}
