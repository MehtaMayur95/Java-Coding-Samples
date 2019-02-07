import java.util.*;
import java.io.*;
import java.util.Scanner;
//one of the best program
//sort both strings and then compare
// convert strings to char array, then sort arrays, then convert back to strings, and then compare. 
class Anagrams
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		
		char[] char1=new char[20];
		char[] char2=new char[20];
		String a_new=a.toLowerCase();
		String b_new=b.toLowerCase();
		int length_a=a_new.length();
		int length_b=b_new.length();
		for(int i=0;i<=length_a;i++)
		{
			char1=a_new.toCharArray();
		}
		
		for(int j=0;j<char1.length-1;j++)
		{
			for(int k=0;k<char1.length-1;k++)
			{
				if(char1[k+1]<char1[k])
				{
					char temp=char1[k+1];
					char1[k+1]=char1[k];
					char1[k]=temp;
				}
			}
		}
	/*	for(int i=0;i<char1.length;i++)
		{
			System.out.println(char1[i]);
		}
		*/
		//sorting of string b;
		for(int i=0;i<=length_b;i++)
		{
			char2=b_new.toCharArray();
		}
		for(int j=0;j<char2.length-1;j++)
		{
			for(int k=0;k<char2.length-1;k++)
			{
				if(char2[k+1]<char2[k])
				{
					char temp=char2[k+1];
					char2[k+1]=char2[k];
					char2[k]=temp;
				}
			}
		}
		/*
		for(int i=0;i<char2.length;i++)
		{
			System.out.println(char2[i]);
		}*/
		
		//System.out.println("\nLength of a is:"+char1.length);
		//System.out.println("\nLength of b is:"+char2.length);
		
		String str1=new String(char1);
		//System.out.println("\n This is String1:"+str1);
		String str2=new String(char2);
		//System.out.println("\n This is String2:"+str2);
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Anagrams");
		}
		else{
			System.out.println("Not Anagrams");
		}
	/*	for(int i=0;i<char1.length && i<char2.length;i++)
		{
			if(char1[i]==char2[i])
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println("\nAnagrams");
		}
		else
		{
			System.out.println("\nNot Anagrams");
		}
		*/
		
	}
}

