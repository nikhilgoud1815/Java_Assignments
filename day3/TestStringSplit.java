package junitForPalindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringSplit {
	@Test
public void split()
{
	StringSplitAndReverse newSplit=new StringSplitAndReverse();
	String result=newSplit.reverseStringByWords("hello everyone i am nikhil");
	assertEquals("olleh enoyreve i ma lihkin",result);
	
}
	@Test
	public void splitTwo()
	{
		StringSplitAndReverse newSplit=new StringSplitAndReverse();
		String result=newSplit.reverseStringByWords("hello everyone i am nikhil");
		assertEquals("olleh enoyreve",result);
		
	}
}
