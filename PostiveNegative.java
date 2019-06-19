import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class PostiveNegative
{
	public static void main (String[] args) 
	{
		int a;
      Scanner in = new Scanner(System.in);
     
      System.out.println("Enter an integer");
      a = in.nextInt();
      System.out.println("You entered integer " + a);
if (a>0)
  System.out.println("Positive");
  
   else
   {
   if (a==0)
   {
 System.out.println("Zero");
   }
   else 
   {
   System.out.println("Negative");
   }}

	}
}
