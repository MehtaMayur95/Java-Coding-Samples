import java.io.*;
import java.util.*;
import java.util.Scanner;
class PhoneDirec2
{
	public static void main(String args[])
	{
		int n;
		long phno;
		String name;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.nextLine();
		HashMap<String,Long> hm=new HashMap<String,Long>();
		for(int i=0;i<n;i++)
		{
		name=sc.nextLine();
		phno=sc.nextLong();
		sc.nextLine();
		hm.put(name,phno);	
		}
		while(sc.hasNext())
		{
			String s=sc.nextLine();
			if((hm.containsKey(s))==true)
			{
			phno = hm.get(s);
			System.out.println(s+"="+phno);
			}
			else
			{
				System.out.println("\nNot Found");
			}
		}
		
	}
}