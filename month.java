import java.io.*;
import java.util.*;
import java.util.Scanner;
public class month{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c;
		System.out.println("Enter the month:");
		c=sc.nextInt();
		switch(c)
		{
			case 1:
			System.out.println("Jan,feb,march comes in Winter");
			break;
			
			case 2:
			System.out.println("April,may,june comes in spring");
			break;
			
			default:
			System.out.println("\nerror");
		}
	}
}