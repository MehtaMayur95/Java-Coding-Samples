import java.io.*;
import java.util.*;
import java.util.Scanner;
class Series
{
	public static void main(String args[])
	{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int n=sc.nextInt();
			double c=Math.pow(2,n);
	
			for(int j=1;j<=c;j++)
			{
				int sum=0;
				sum=sum+(a+(j*b));
				j=j*2;
				System.out.print(+sum+" ");
			}
			System.out.println();
			
		}
	}
}