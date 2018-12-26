package junitForPalindrome;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class DifferenceIndicesTest {
	private  DifferenceIndices Indices;
	@Before
public void beforeFunction()
{       
		Indices=new DifferenceIndices();
}
	@Test
	public  void IndicesTestOne()
	{
		int[] array={1,2,1,3};
		assertEquals(true,Indices.isDistinctValue(array,4));
	}
	
	@Test
	public  void IndicesTestTwo()
	{
		int[] array={1,2,3,4};
		assertEquals(true,Indices.isDistinctValue(array,4));
	}
	@Test
	public  void IndicesTestThree()
	{
		int[] array={1,2,3,4,2};
		assertEquals(true,Indices.isDistinctValue(array,5));
	}
}
