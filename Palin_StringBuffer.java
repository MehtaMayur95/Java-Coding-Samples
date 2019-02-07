import java.util.Scanner;
import java.util.*;
import java.io.*;
class Palin_StringBuffer
{
	public static void main(String args[])
	{
		//StringBuffer sb=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the String:");
		String str=sc.nextLine();
		String temp=str; //store value of string in temp;
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();//reverse the string in stringbuffer
		str=sb.toString();
		//convert the stringbuffer into string again
		if(temp.equalsIgnoreCase(str))
		{
			System.out.println("\nIt is a palindrome");
		}
		else
		{
			System.out.println("\nIt is not a palindrome");
		}
	}
}