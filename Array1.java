import java.util.Scanner;
import java.io.*;

class Array1{
	public static void main(String args[])
	{
		int ar[]=new int[5];
		int i,n;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(i=0;i<5;i++){
		System.out.println("\nValues are:"+ar[i]);
		}
	}
}