import java.util.*;
import java.io.*;
import java.util.Scanner;
class ArrayList2
{
	public static void main(String args[])
	{
		int pos,e;
		Scanner sc=new Scanner(System.in);
		//System.out.println("\nEnter the number of elements:");
		int n=sc.nextInt();
		Integer[] ar1=new Integer[n];
		//System.out.println("\nEnter the elements:");
		for(int i=0;i<n;i++)
		{
			ar1[i]=sc.nextInt();
		}
		/*for(int i=0;i<ar1.length;i++)
		{
			System.out.println(ar1[i]);
		}*/
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(ar1));
		//System.out.println("\nValues are:"+list);
		//do queries here
		//System.out.println("\nEnter the number of queries:");
		int q=sc.nextInt();
		while(q>0)
		{
			//System.out.println("\nEnter the query in string:");
			String choice=sc.next();
			switch(choice)
			{
				case "Insert":
				//System.out.println("\nEnter the index:");
				pos=Integer.parseInt(sc.next());
				//System.out.println("\nEnter the element:");
				e=Integer.parseInt(sc.next());
				list.add(pos,e);
				//System.out.println(list);
				break;
				
				case "Delete":
				//System.out.println("\nEnter the index:");
				pos=Integer.parseInt(sc.next());
				list.remove(pos);
				break;
			}
			
			q--;
		}
		System.out.println(list);
		Integer[] ar2=new Integer[list.size()];
		ar2=list.toArray(ar2);
		for(Integer m:ar2)
		{
			System.out.print(+m+" ");
		}
		
	}
}