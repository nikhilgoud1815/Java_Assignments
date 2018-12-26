
	import java.util.*;
	public class ArmstrongNumber
	{
	 int number=100, originalNumber, remainder, result = 0;
           for(number=100;number<1000;number++)
           {
             originalNumber = number;
         while (originalNumber != 0)
           {
            remainder = originalNumber%10;
            result =result+remainder*remainder*remainder;
            originalNumber = originalNumber/10;
           }
        if(result == number)
	{

          System.out.println(number);
	}
	}
	}