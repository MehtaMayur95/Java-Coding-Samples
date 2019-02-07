import java.util.*;
import java.io.*;
import java.util.Scanner;
class StackExample
{
	public static void main(String args[])
	{
		Stack<Integer> st=new Stack<Integer>();
		int choice=0;
		int e,pos;
		Scanner sc=new Scanner(System.in);
		while(choice<4)
		{
			System.out.println("\nEnter your choice:");
			System.out.println("\n1:Push element in stack");
			System.out.println("\n2:Pop element out from stack");
			System.out.println("\n3:Search for an element of stack");
			choice =sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("\nEnter the element:");
				//note here e is converted to Wrapper class Integer thru parseInt method and sc.nextInt is not called, use sc.next();
				e=Integer.parseInt(sc.next());
				st.push(e);
				break;
				
				case 2:
				Integer obj=st.pop();
				System.out.println("\npopped element:"+obj);
				break;
				
				case 3:
				System.out.println("\nWhich element is to be searched:");
				e=Integer.parseInt(sc.next());
				pos=st.search(e);
				if(pos==-1)
				{
					System.out.println("\nElement not found");
				}
				else
				{
					System.out.println("\nPosition is:"+pos);
				}
				break;
				
				default:
				System.out.println("\nPlease Enter valid option");
			}
			System.out.println("\nStack is:"+st);
		}
	}
}