package com.capgemini;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
public class EmployeeClassFileCreateTest 
{
	private EmployeeClass createFile;  //creates two objects for EmployeeClass
	private EmployeeClass createFileTwo;
	
	@Test
	public void testCreate() throws IOException 
	{
		createFile=new EmployeeClass("nikhil",22,75);
		File file =new File("C:/Users/anikhil/new file.txt");
		FileWriter writer=new FileWriter(file);
		String result=createFile.toString();
		writer.write(result);
		writer.close();
	}
	
	@Test
	public void testCreateTwo() throws IOException 
	{
		createFileTwo=new EmployeeClass("pavan",22,65);
		File file =new File("C:/Users/anikhil/new file.txt");
		FileWriter writer=new FileWriter(file);
		String result=createFileTwo.toString();
		writer.write(result);
		writer.close();
	}

}
