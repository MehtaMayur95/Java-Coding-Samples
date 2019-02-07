import java.io.*;
import java.util.Scanner;
import java.util.*;
class Primeornot{
	public static void main(String args[])
	{
	int n;
	boolean flag=false;
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter the number:");
	n=sc.nextInt();
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			flag=true;
			break;
		}
		else{
			flag=false;
		}
	}
	if (flag==true)
	{
		System.out.println("It is not a prime");
	}
	else
	{
		System.out.println("It is a prime");
	}
}
}