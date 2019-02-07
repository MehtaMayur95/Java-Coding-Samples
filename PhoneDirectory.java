import java.util.*;
import java.io.*;
import java.util.Scanner;

class PhoneDirectory
{
	public static void main(String args[])throws IOException
	{
		//using hashmap store phone numbers into directory where name is the key;
		Scanner sc=new Scanner(System.in);
		int choice=0;
		String name;
		long phno;
		HashMap<String,Long> hm=new HashMap<String,Long>();
		while(choice<5)
		{
			System.out.println("\nPress 1: To Add a new number");
			System.out.println("\nPress 2: To Remove a number");
			System.out.println("\nPress 3: To Search for a number");
			System.out.println("\nPress 4: To View the Directory");
			System.out.println("\nEnter you choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("\nEnter your name:");
				name=sc.next();
				System.out.println("\nEnter your phone no:");
				phno=Long.parseLong(sc.next());
				hm.put(name,phno);
				System.out.println("\nThe directory is:"+hm);
				break;
				
				case 2:
				System.out.println("\nEnter the name:");
				name=sc.next();
				hm.remove(name);
				break;
				
				case 3:
				System.out.println("\nEnter the name to be searched:");
				name=sc.next();
				phno = hm.get(name);
				System.out.println("\nPhone no is:"+phno);
				break;
				
				case 4:
				//most imp
				//use this oprion if you only want to display key and not value.
				Set<String> hs=new HashSet<String>();
				hs=hm.keySet();
				System.out.println("\nPhone book:"+hs);
				break;
				
				default:
				System.out.println("\nEnter valid option");
			}
		}
	}
}