import java.io.*;
import java.util.*;
import java.util.Scanner;
public class swap
{
	public static void main(String args[])
	{
		try{
		//int n1=Integer.parseInt(args[0]);
		//int n2=Integer.parseInt(args[1]);
		Scanner sc=new Scanner(System.in);
		System.out.println("\nenter the number1:");
		int n1=sc.nextInt();
		System.out.println("\nenter the number2:");
		int n2=sc.nextInt();
		System.out.println("\nBefore swapping:"+n1+" "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("\nAfter swap Numbers are:"+n1+" "+n2);
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		
	}
}