import java.util.*;
   class Calculator
      {
       static int add(int number1,int number2)
          {
            int number3=number1+number2;
             return number3;
          }   

        static int subtract(int number1,int number2)
          {
             int number3=number1-number2;
             return number3;
          }   
	   static int multiply(int number1,int number2)
          {
             int number3=number1*number2;
              return number3;
          }   
	  static int divide(int number1,int number2)
          {
             int number3=number1/number2;
              return number3;
          }   
     	     public static void main(String[] args)
	     {
                System.out.println(add(5,5));
                System.out.println(subtract(10,5));
	        System.out.println(multiply(20,10));
	        System.out.println(divide(20,10));
	      
     	     }
      }