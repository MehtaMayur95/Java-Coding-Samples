import java.io.*;
import java.util.Scanner;
import java.util.*;
class fibonew
{
	public static void main(String args[])
	{
		int n,temp1=0,temp2=1,temp=0;
		System.out.println("\nEnter the number to generate its fibonacci series:");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println("\nValues are:"+temp);
			temp=temp1+temp2;
			temp1=temp2;
			temp2=temp;
			
		}
		
	}
}