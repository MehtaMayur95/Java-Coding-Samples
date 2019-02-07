import java.util.*;
import java.io.*;
import java.util.Scanner;
public class fact
{
	public static void main(String args[])
	{
		int n,sum=1,i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number to find its factorial:");
		n=sc.nextInt();
		while(i<=n)
		{
			sum=sum*i;
			i++;
			
		}
		System.out.println("\nFact:"+sum);
		
	}
}