package com.capgemini;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class TrainingTest {
private PublicTraining trainingPublic;
private CorporateTraining trainingCorporate;
		
	
	@Test
	public void testPublic() {
		Training.fees=5000;
		Training.id=10;
		Training.subject="java";	
	
		trainingPublic=new PublicTraining ();
		assertEquals(250000,trainingPublic.getOrderValue(50));
	}
	@Test
	public void testCorporate() {
		Training.fees=35000;
		Training.id=20;
		Training.subject="Bigdata";	
	
		trainingCorporate=new CorporateTraining ();
		assertEquals(700000,trainingCorporate.getOrderValue(20));
	}

}
