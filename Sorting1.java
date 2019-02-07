import java.util.Scanner;
import java.util.*;
import java.io.*;
class Sorting1
{
	public static void main(String args[])
	{
		int i,length;
		int[] unsorted=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the numbers:");
		for(i=0;i<5;i++)
		{
			unsorted[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			System.out.println("\n"+unsorted[i]);
		}
		
		length=unsorted.length;
		System.out.println("\nLength is:"+length);

		for(int j=0;j<unsorted.length-1;j++)
		{
			for(int k=0;k<unsorted.length-1;k++)
			{
				if(unsorted[k+1]<unsorted[k])
				{
					int temp = unsorted[k+1];
					unsorted[k+1]=unsorted[k];
					unsorted[k]=temp;
				}
			}
		}
		for(i=0;i<5;i++)
		{
			System.out.println(unsorted[i]);
		}
	
	}
}