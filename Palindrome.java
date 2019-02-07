import java.util.Scanner;
import java.util.*;
import java.io.*;

class Palindrome
{
	public static void main(String args[])
	{
		int n,temp,sum=0,r;
		System.out.println("\nEnter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}
}