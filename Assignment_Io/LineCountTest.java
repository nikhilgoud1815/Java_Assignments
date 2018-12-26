package com.capgemini;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class LineCountTest {
	private LineCount lineCount;
	
	@Before
	public  void countLines()
	{
		lineCount=new LineCount();
	}

	@Test
	public void lineCounttTest() throws IOException
	{
		assertEquals(31,lineCount.countLine());
		System.out.println(lineCount.countLine());
	}
}
