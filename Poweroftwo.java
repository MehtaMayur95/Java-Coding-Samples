import java.util.Scanner;
import java.util.*;
import java.io.*;
class Poweroftwo
{
	public static void main(String args[])
	{
		int n;
		int i=2;
		int flag=0;
		System.out.println("\nEnter the value:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(i<=n)
		{
			if(n%i==0)
			{
				flag=1;
			}
			else
			{
				flag=0;
				break;
			}
			i=i*2;
		}
		if(flag==1)
		{
			System.out.println("\nIt is Power of two");
		}
		else{
			System.out.println("\nIt is not power of two");
		}
	}
}