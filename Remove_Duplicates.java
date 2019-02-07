import java.io.*;
import java.util.*;
import java.util.Scanner;
class Remove_Duplicates
{
public static void main(String args[])
{
	String s="";
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter the string:");
	s=sc.nextLine();
	String dup="";
	int length=s.length();
	System.out.println(length);
	for(int i=0;i<=length-1;i++)
	{
		if(s.charAt(i)==s.charAt(length[i]))
		{
			System.out.println("\nSame chars found");
			System.out.println(i);
			break;
		}
		/*else
		{
			System.out.println("\nDidnt found");
		}
		*/
	}
	
	
}
}