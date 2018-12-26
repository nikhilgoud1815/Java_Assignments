package junitForPalindrome;
public class MultiDimensionalArray {
	public boolean findingNumber(int Number, int[][] array)
	{
		boolean result=false;
		for(int numberOne = 0;numberOne < array.length;numberOne++)
		{
			for(int numberTwo = 0;numberTwo < array[0].length; numberTwo++)
			{
				if(array[numberOne][numberTwo]== Number)
				{
					result = true;
				}
			}return result;
		}
		return result;
	}
	
	}
