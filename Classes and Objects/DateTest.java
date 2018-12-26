package com.capgemini;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class DateTest 
{	
	private Date privateDateTest;
	private Date smaller;
	
	@Before  //it executes before every method
	public void beforeTest()
	{
		privateDateTest=new Date(12,05,2019);
	}
	
	@Test
	public void checkSmallerDate() 
	{
		assertEquals(false,privateDateTest.isSmaller(privateDateTest));
	}

	@Test
	public void checkString() 
	{
		assertEquals("12/5/2019",privateDateTest.toString());
	}
	
	@Test
	public void checkDifferenceInDate() 
	{
		int newArray[]={-1,0,0};
		assertArrayEquals(newArray,privateDateTest.difference(privateDateTest));
	}

}
