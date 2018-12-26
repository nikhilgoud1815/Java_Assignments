import java.util.Scanner;
import java.util.*;
public class junit
{
public static void main(String[] args)
{
int number, originalNumber, remainder, result = 0;
System.out.println("Enter a three digit integer: ");
Scanner sc=new Scanner(System.in);
number=sc.nextInt();
originalNumber = number;
while (originalNumber != 0)
{
remainder = originalNumber%10;
result s= result*10+remainder;
originalNumber /= 10;
}
          if(result == number)
          System.out.println("its a palindrome.");
          else
          System.out.println(" is not an palindrome.");
         }
	    }