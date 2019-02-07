import java.util.Scanner;
import java.util.*;
import java.io.*;

class Palindrome_2
{
	public static void main(String args[])
	{
		int n,temp,sum;
		System.out.println("\nEnter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		int z=n/10;
		int a=n%10;
		int b=z%10;
		int c=z/10;
		sum= (a*100)+(b*10)+c;
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