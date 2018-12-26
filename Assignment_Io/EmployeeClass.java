package com.capgemini;

/*import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;*/

public class EmployeeClass 
{
	private String name;
	private int age;
	private int weight;
	@Override
	public String toString() //creating toString method
	{
		return "EmployeeClass [name=" + name + ", age=" + age + ", weight="
				+ weight + "]";
	}

	
	public EmployeeClass(String name,int age,int weight)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
	}	
}