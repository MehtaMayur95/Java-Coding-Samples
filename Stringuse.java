import java.io.*;
import java.util.*;
import java.util.Scanner;
class Stringuse
{
	public static void main(String args[])
	{
		System.out.println("\nEnter the first String s1:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2="Mayur Mehta ";
		char arr[]={'k','h','a','n'};
		String s3=new String(arr);
		
		String s4=s2.trim();
		System.out.println("\nafter trim: "+s4);
		String s5=s1.concat(s2);
		System.out.println("\nafter conctention: "+s5);
		String s6=s2.substring(0,8);
		System.out.println("\nSubstring of s2: "+s6);
		String s7=s1.substring(1,5);
		System.out.println("\nSubstring of s1: "+s7);
		String s8=s6+s7;
		System.out.println("\nadding the substrings: "+s8);
		//check if a character starts with "M"
		boolean x=s2.startsWith("M");
		if(x==true)
			System.out.println("\nstarts with M");
		else
			System.out.println("\nnot starts with M");
		//lenght of string
		System.out.println("\nLenght of s2 is:"+s2.length());
		int c=s2.compareTo(s1);
		System.out.println("\n"+c);
		int n=s2.indexOf(s1);
		System.out.println("\nIndex is:"+n);
		
		
	}
}