import java.io.*;
import java.util.*;
import java.util.Scanner;
class DynamicArrayList1
{
	public static void main(String args[])
	{
		int n,e,d,q,l,s;
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number of lines:");
		n=sc.nextInt();
		ArrayList[] list=new ArrayList[n];
			
		for(int i=0; i<n; i++)
		{
			System.out.println("\nEnter the elements:");
			d=sc.nextInt();
			list[i] = new ArrayList<Integer>();
			for(int j=0;j<d;j++)
			{
				list[i].add(sc.nextInt());
			}
				System.out.println(list[i]);	
		}
		for(int k=0;k<list.length;k++)
		{
		System.out.println(list[k]);
		}
		System.out.println("\nEnter the number of queries:");
		q=sc.nextInt();
		for(int i=0;i<q;i++)
		{
			System.out.println("\nEnter the line number:");
			l=sc.nextInt();
			System.out.println("\nEnter the index:");
			s=sc.nextInt();
			for(int j=0;j<list.length;j++)
			{
			if(list[j].contains(s)==true)
			
			{
				System.out.println(list[j].get(s));
				
			}
			else
			{
				System.out.println("ERROR!")
			}
			}
			
		}
	}
}