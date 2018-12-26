package junitForPalindrome;
import static org.junit.Assert.*;

import org.junit.Test;
public class MissingTermTest {
	@Test
	public void missingFunction()
	{
		int array[] = {1,2,4,5,6};
		MissingTerm value=new MissingTerm();
		assertEquals(3,value.getMissingNo(array,5));
	}
	@Test
	public void missingFunctionTwo()
	{
		int array[] = {1,2,4,3,5};
		MissingTerm value=new MissingTerm();
		assertEquals(6,value.getMissingNo(array,5));
	}
	@Test
	public void missingFunctionThree()
	{
		int array[] = {6,2,4,3,5};
		MissingTerm value=new MissingTerm();
		assertEquals(1,value.getMissingNo(array,5));
	}

}
