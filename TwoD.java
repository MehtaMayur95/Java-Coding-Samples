import java.util.Scanner;
import java.io.*;
public class TwoD
{
	public static void main(String args[])
	{
		int ar1[][]=new int[2][2];
		int ar2[][]=new int[2][2];
		int sum[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			ar1[i][j]=sc.nextInt();
			}
		}
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
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			sum[i][j]=ar1[i][j]+ar2[i][j];
			System.out.println("\nAddition of both is:"+sum[i][j]);
			}
		}
		
		
		
	}
}