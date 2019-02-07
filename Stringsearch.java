import java.util.Scanner;
import java.util.*;
import java.io.*;
class Stringsearch{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many strings:");
		n=sc.nextInt();
		String[] str=new String[n];
		System.out.println("\nEnter the strings:");
		for(int i=0;i<n;i++)
		{
			str[i]=sc.nextLine();
		}
		System.out.println("\nEntered strings are");
		for(int i=0;i<n;i++)
		{
			System.out.println(str[i]);
		}
		
		System.out.println("\nEnter the string to be searched:");
		String searching=sc.nextLine();
		for(int i=0;i<=n;i++)
		{
			if(searching.equalsIgnoreCase(str[i]))
			{
				System.out.println("\nString found"+"\t"+ (i+1));
			}
			else
			{
				System.out.println("not found");
			}
		}
	}
}