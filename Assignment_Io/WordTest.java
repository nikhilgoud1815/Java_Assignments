package com.capgemini;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class WordTest {
	private static WordCount wordCount;

	@Before
	public  void countNumberOfWords() 
	{
		wordCount=new WordCount();
		
	}

	@Test
	public void test() throws IOException {
		assertEquals(1167,wordCount.countNumberOfWords());
	}

}
