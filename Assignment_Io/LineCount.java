package com.capgemini;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;

public class LineCount
{
	public int countLine() throws IOException
	{
		int linenumber = 0;
	File file = new File("C://Users/anikhil/workspace/Java_Assignment/src/ArmstrongNumber.java");
	if(file.exists())
	{
	    LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file)); 
        while (lineNumberReader.readLine() != null)
        {
        	linenumber=linenumber++;
        }
        linenumber=lineNumberReader.getLineNumber();
        lineNumberReader.close(); 
	}
	return linenumber;
}
}
