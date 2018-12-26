package junitForPalindrome;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class StringSplitAndReverse {
	String reverseStringByWords(String name)
	{
		String[] givenString=name.split(" ");
		String reverse="";
		String reverseFull="";
		for(int count=0;count<givenString.length;count++)
		{
			for(int counter=givenString[count].length()-1;counter>=0;counter--)
			{
				reverse=reverse+givenString[count].charAt(counter);
			}
			reverseFull=reverseFull+reverse;
			reverse="";
			if(count!=givenString.length-1)		
				reverseFull=reverseFull+" ";
		}
		return reverseFull;
	}
}
	

