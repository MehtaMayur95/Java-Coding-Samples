import java.io.*;
import java.util.*;
import java.util.Scanner;

class reverse throws IOException
{
	    
		int length=c.length();
		void reverse()
		{
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+c.charAt(i);
		}
		System.out.println(rev);
		}
}
class Reverse_eliminate
{
	public static void main(String args[])
	{
		String c="";
		String rev="";
		System.out.println("\nEnter the String:");
		Scanner sc=new Scanner(System.in);
		c=sc.nextLine();
		reverse r=new reverse();
		r.reverse();
	}
}

