package com.capgemini;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class CheckFileTest {
private FileExistsOrNot checksFile; 
@Before
public void setUp()
{
	checksFile=new FileExistsOrNot();
}
	

	@Test
	
	public void fileAvailabilityTest() {
		assertEquals(true,checksFile.checkFile());
	}

}
