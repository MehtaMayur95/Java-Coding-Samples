import java.util.Scanner;
import java.util.*;
import java.io.*;

class Armstrong
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number:");
		n=sc.nextInt();
		int z=n/10;
		int a=n%10;
		int b=z%10;
		int c=z/10;
		if((a*a*a)+(b*b*b)+(c*c*c)==n)
		{
			System.out.println("It is an armstrong number");
		}
		else
		{
			System.out.println("It is not an armstrong number");
		}
		
		
	}
}