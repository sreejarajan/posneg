import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class GUVI
{
	public static void main (String[] args) 
	{
		int a;
      Scanner in = new Scanner(System.in);
      a = in.nextInt();
      
      if (a<0)
  System.out.println("Invalid");
  
   else
   {
   if (a%2==0)
   {
 System.out.println("Even");
   }
   else 
   {
   System.out.println("Odd");
   }}

	}
}
