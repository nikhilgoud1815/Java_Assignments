package junitForPalindrome;
import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeCommonFile
{
	public boolean palindromeFunction(int number){
		
	
	
	int result=0;
	int originalNumber = number;
	if(number>10)
	{
	while (number != 0)
	{
     int remainder = number%10;
     result = result*10+remainder;
     number /= 10;
     
    }
	return result==originalNumber;
	}
	return false;
	}
}