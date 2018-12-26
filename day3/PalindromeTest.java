package junitForPalindrome;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {
	private PalindromeCommonFile test;
	@Before
	public void setUp()
	{
		test=new  PalindromeCommonFile();
	}
	@Test
	public void call() {
			assertEquals(true,test.palindromeFunction(121));
	}

	@Test
	public void wrongInput() {
		assertEquals(false,test.palindromeFunction(-121));
	}
	@Test
	public void includingSymbols() {
		assertEquals(false,test.palindromeFunction(10));
	}
	private void assertEqauls(int i, int resultTest) {
		// TODO Auto-generated method stub

	}
}