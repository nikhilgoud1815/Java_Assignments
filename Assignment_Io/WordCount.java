package com.capgemini;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount 
{
	public int countNumberOfWords() throws IOException
	{
		FileReader file=new FileReader("C://Users/anikhil/workspace/Java_Assignment/src/ArmstrongNumber.java");
		BufferedReader br=new BufferedReader(file);
		String line=br.readLine();
		int count=0;
		while(line!=null)
		{
			String []parts=line.split("");
			for(String words:parts)
			{
				count++;
			}
			line=br.readLine();
		}

		return count;
	}
}