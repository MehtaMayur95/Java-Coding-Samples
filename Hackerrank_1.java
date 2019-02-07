/*Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird*/

import java.util.Scanner;
import java.io.*;
import java.util.*;

class Hackerrank_1
{
	public static void main(String args[])
	{
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number to check if its weird or not");
		n=sc.nextInt();
		if(n%2!=0)
		{
			System.out.println("Weird");
		}
		else if(n%2==0 && n>=2 && n<=5)
		{
			System.out.println("Not Weird");
		}
		else if(n%2==0 && n>=6 && n<=20)
		{
			System.out.println("Weird");
		}
		else if(n%2==0 && n>20)
		{
			System.out.println("Not Weird");
		}
		else{
			System.out.println("Enter a valid number please");
		}
}
}