import java.util.*;
import java.io.*;
import java.util.Scanner;
class Hashsetexample
{
public static void main(String args[])
{
	HashSet<String> hs=new HashSet<String>();
	hs.add("Mayur");
	hs.add("khan");
	hs.add("Mehta");
	hs.add("loser");
	hs.remove("khan");
	System.out.println("\nHashset");
	Iterator it=hs.iterator();
	
	for(String s: hs)
	{
		String s1=(String)it.next();
		System.out.println(s1);
	}
}
}