import java.util.Scanner;
import java.io.*;
class MatrixMul
{
	public static void main(String args[])
	{
		int ar1[][]=new int[2][2];
		int ar2[][]=new int[2][2];
		int sum[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		int i,j,k;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				ar1[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nMatrix-1:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(" "+ar1[i][j]+" ");
			}
			System.out.println(" ");
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				ar2[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nMatrix-2:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(" "+ar2[i][j]+" ");
			}
			System.out.println(" ");
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				for(k=0;k<2;k++)
				{
					sum[i][k]+=ar1[i][j]*ar2[j][k];
				}
			}
		}
		System.out.println("\nMatrix Multiplication");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;k++)
			{
				System.out.print(" "+sum[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}