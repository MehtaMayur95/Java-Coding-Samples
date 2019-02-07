import java.util.*;
import java.io.*;
import java.util.Scanner;

public class calc
{
	public static void main(String args[])
	{
		int sum,n1,n2;
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter number1:");
		n1=sc.nextInt();
		System.out.println("\nEnter number2:");
		n2=sc.nextInt();
		System.out.println("\nEnter the task:");
		c=sc.next().charAt(0);//IMP
		switch(c)
		{
			case '+':
			sum=n1+n2;
			System.out.println("\nSum is:"+sum);
			break;
			
			case '-':
			sum=n1-n2;
			System.out.println("\nSum is:"+sum);
			break;
			
			case '*':
			sum=n1*n2;
			System.out.println("\nSum is:"+sum);
			break;
			
			case '/':
			sum=n1/n2;
			System.out.println("\nSum is:"+sum);
			break;
			
			default:
			System.out.println("error");
			
		}
	}
}