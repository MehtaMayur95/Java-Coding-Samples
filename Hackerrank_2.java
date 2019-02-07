import java.io.*;
import java.util.*;
import java.util.Scanner;

class Hackerrank_2
{
public static void main(String args[])
{
	int N;
	Scanner sc=new Scanner(System.in);
	N=sc.nextInt();
	int i=1;
	while(i<=10)
	{
		System.out.println(N+" X "+i+" = "+(N*i));
		i++;
	}
}
}