import java.util.*;
import java.io.*;
import java.util.Scanner;

public class StringSplit
{
public static void main(String[] args)
{
System.out.println("enter a group of words");
Scanner read=new Scanner(System.in);
String words=read.nextLine();
for(String divide:words.split("\\s")){
System.out.println(divide.reverse());
}
}
}