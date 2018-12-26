package junitForPalindrome;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestMultiDimensionalArray {
	private MultiDimensionalArray multiArray;
	@Before    //executes before every @Test
	public void TestBeforeEveryFunction()
	{
		multiArray=new MultiDimensionalArray();
	}

	@Test
	public void testOne() 
	{
		int setNumberedArray[][] = {
				{1,2,3},
				{4,11,6},
				{7,8,9}
				};
		boolean result = multiArray.findingNumber(11,setNumberedArray);
		assertEquals(true,result); //if the result equals to 5 then it returns green line 
		
	}
	@Test
	public void testTwo() 
	{
		int array[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};

		boolean result =multiArray.findingNumber(10,array);
		assertEquals(false,result);
		}

}
