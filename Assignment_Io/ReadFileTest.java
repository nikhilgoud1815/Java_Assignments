package com.capgemini;
import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
public class ReadFileTest 
{
	private ReadFile readFileTest;     //creates an object of the class ReadFile
	
	@Before                           //it executes before every @Test once
	public void testToReadFileInBefore()
	{
	readFileTest=new ReadFile();
	}

	@Test
	public void testToReadFile() throws IOException 
	{
	assertEquals("EmployeeClass [name=nikhil, age=22, weight=65]",readFileTest.readAndReturnFile())	;	
	}
	
	@Test
	public void testToReadFileTwo() throws IOException 
	{
	assertEquals("EmployeeClass [name=pavan, age=22, weight=65]",readFileTest.readAndReturnFile())	;	
	}
	
}
