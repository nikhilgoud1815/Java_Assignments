package com.capgemini;

public class CorporateTraining extends Training{  //this is a sub class of parent class Training
	public int days;

	public int getDate() {
		return days;
	}

	public void setDate(int date) {
		this.days = date;
	}
	
public int getOrderValue(int days){
	return fees * days;
}
}
