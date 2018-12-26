package com.capgemini;

public class PaymentGateway 
{
	/*creating new method which helps in withdraw and deposit money*/
	
	public static boolean transfer(SavingsAccount sender, SavingsAccount receiver, double amount){
		if(sender.getAccountBalance()>=amount)
		{
			sender.withdrawAmount(amount);
			receiver.depositAmount(amount);
			return true;
		}
		else
			return false;
		
	}

}
