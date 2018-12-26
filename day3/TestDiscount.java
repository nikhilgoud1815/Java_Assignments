package junitForPalindrome;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestDiscount {
	private FindDiscount discount;
	@Before   //executes before every function
	public void setUp()
	{
		discount = new FindDiscount();
	}
	@Test
	public void test1() 
	{
		int itemValue= 100;
		int actual = discount.itemDiscount(itemValue);
		assertEquals(65,actual);
	}
	@Test
	public void test2() 
	{
		int itemValue= 35;
		int actual = discount.itemDiscount(itemValue);
		assertEquals(23,actual);
	}
	@Test
	public void test3() 
	{
		int itemValue= -305;
		int actual = discount.itemDiscount(itemValue);
		assertEquals(0,actual);
	}
}
