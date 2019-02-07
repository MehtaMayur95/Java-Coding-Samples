import java.util.*;
import java.io.*;
import java.util.Scanner;

public class fibo
{
public static void main(String args[])
{
	int n,n1=0,n2=1,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("\nPrint the number:");
	n=sc.nextInt();
	for(int i=0;i<=n;i++)
	{
		System.out.println("\nSeries is:"+n1);
		sum=n1+n2;
		n1=n2;
		n2=sum;
		
	}
	
}
}