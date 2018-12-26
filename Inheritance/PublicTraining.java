package com.capgemini;

public  class PublicTraining extends  Training{  //PublicTraining  is a sub class of Training
	public int noOfParticipents;
	
	public int getNoOfparticipents() { 
		return noOfParticipents;
	}
	
	public void setNoOfparticipents(int noOfparticipents) {
		this.noOfParticipents = noOfparticipents;
	}
	
	public int getOrderValue(int noOfParticipents) {
		return noOfParticipents*fees;
		// TODO Auto-generated method stub	
	}
}
