package com.capgemini;

public abstract class Training //creating a abstract class which has an abstract method in it
{
	public static int id;
	public static String subject;
	public static int fees;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	public abstract int getOrderValue(int result);//abstract method
	}
	


