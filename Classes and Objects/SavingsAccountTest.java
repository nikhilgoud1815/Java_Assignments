package com.capgemini;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;


public class SavingsAccountTest
{

	private SavingsAccount savingsAccount,savingsAccountTwo;
	private PaymentGateway gateway;
	
	@Test
	public void checkingPaymentGateway() 
	{
		gateway=new PaymentGateway();
		savingsAccount=new SavingsAccount("nikhil",10000);
		savingsAccountTwo=new SavingsAccount("akhil",5000);
		assertEquals(true,gateway.transfer( savingsAccount, savingsAccountTwo,2500));
	}
	
	@Test
	public void depositTest() 
	{
		savingsAccount=new SavingsAccount("nikhil",10000);
		assertEquals(10500,savingsAccount.depositAmount(500),0.0);
	}
	
	@Test
	public void withdrawTest() {
		savingsAccount=new SavingsAccount("nikhil",10000);
		assertEquals("transaction successfull",savingsAccount.withdrawAmount(500));
	}

}
