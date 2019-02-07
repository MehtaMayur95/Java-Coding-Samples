import java.util.Scanner;
import java.util.*;
import java.io.*;

class Palindrome_string
{
	public static void main(String args[])
	{
		String c;
		String reverse="";
		System.out.println("\nEnter the String:");
		Scanner sc=new Scanner(System.in);
		c=sc.nextLine();
		int length = c.length();
		System.out.println(+length);
		for(int i=length-1;i>=0;i--)
		{
			reverse= reverse + c.charAt(i);
		}
		if(c.equals(reverse))
		{
			System.out.println("\nIt is Palindrome");
		}
		else
		{
			System.out.println("\nIt is not Palindrome");
		}
	}
}