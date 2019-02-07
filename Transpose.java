import java.util.Scanner;
import java.util.*;
import java.io.*;
class Transpose
{
	public static void main(String args[])
	{
		int m ,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column:");
		m=sc.nextInt();
		n=sc.nextInt();
		int[][] arr=new int [m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("\nenter the values:");
				arr[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		//transpose logic here
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();
		}
	}
}