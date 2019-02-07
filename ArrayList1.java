import java.util.*;
import java.io.*;
import java.util.Scanner;
class ArrayList1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char choice='\0';
		String e=" ";
		int pos;
		ArrayList<String> ar1=new ArrayList<String>();
		while(choice!='E')
		{
			System.out.println("\nPress A: To add a string");
			System.out.println("\nPress D: To delete a string");
			System.out.println("\nPress R:To replace a string");
			System.out.println("\nPress S:To search a string");
			System.out.println("\nPress E to exit");
			System.out.println("\nEnter your choice:");
			choice=sc.next().charAt(0);
			
			switch(choice)
			{
				case 'A':
				System.out.println("\nEnter the string to be entered:");
				e=sc.next();
				System.out.println("\nEnter the position:");
				pos=Integer.parseInt(sc.next());
				ar1.add(pos-1,e);
				System.out.println("\nList is:"+ar1);
				break;
				
				case 'D':
				System.out.println("\nEnter the String to be removed:");
				e=sc.next();
				ar1.remove(e);
				System.out.println("\nList after deletion:"+ar1);
				break;
				
				case 'R':
				System.out.println("\nEnter the new string for replacement:");
				e=sc.next();
				System.out.println("\nEnter the position:");
				pos=Integer.parseInt(sc.next());
				ar1.set(pos-1,e);
				System.out.println("\nList after replacement:"+ar1);
				break;
				
				case 'S':
				System.out.println("\nEnter the string to be searched:");
				e=sc.next();
				if(ar1.contains(e)==true)
				{
					System.out.println("\nPosition of string is:"+ar1.indexOf(e));
				}
				else
				{
					System.out.println("\nNot found");
				}
				break;
				
				default:
				System.out.println("\nEnter the valid option");
			}
			
		}
	}
}