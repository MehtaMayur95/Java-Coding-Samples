import java.util.*;
import java.io.*;
import java.util.Scanner;
public class Odd
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nenter the number:");
		n=sc.nextInt();
		if (n%2==0)
		{
			System.out.println("\nEven");
		}
		else
		{
			System.out.println("\nOdd");
		}
		
	}
}