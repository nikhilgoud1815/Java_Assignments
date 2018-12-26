package com.capgemini;

import java.io.BufferedReader;//imports BufferedReader to read file line by line
import java.io.FileReader;
import java.io.IOException;

public class ReadFile
{
	public String readAndReturnFile() throws IOException    
	{
		FileReader file=new FileReader("C:/Users/anikhil/new file.txt");
		BufferedReader buffer=new BufferedReader(file);
		String firstString="";
		String toStoreString="";
		while((firstString=buffer.readLine())!=null) //reads all the lines in the file till it becomes null
		{
			toStoreString=toStoreString+firstString;
		}
		buffer.close();
		return toStoreString;
	}
}
