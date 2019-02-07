import java.io.*;
import java.util.*;
import java.util.Scanner;
public class stack{
	int s[]=new int[5];
	int t;
	stack()
	{
		t=-1;
	}
	void push(int i)
	{
		if(t>=4)
		{
			System.out.println("\nStack is full");
		}
		else
		{
		s[++t]=i;
		}
	}
	int pop()
	{
		if(t<0)
		{
			System.out.println("\nStack is empty");
		}
		else
		{
			return s[t--];
		}
		return 0;
	}
	
	void disp()
	{
		if(t<0)
		{
			System.out.println("Stack is empty");
			
		}
		else{
			for(int i=t;i>0;i++)
			{
			System.out.println("Stack:"+s[i]);
			}
		}
	}
	public static void main(String args[])
	{
		stack s=new stack();
		int x,y,c;
		boolean y=true;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("\n1-Push");
		System.out.println("\n2-Pop");
		System.out.println("\n3-Display Stack");
		System.out.println("\n4-exit");
		System.out.println("\nEnter your choice:");
		c=sc.nextInt();
		
		switch(c)
		{
			case 1:
			System.out.println("Enter the value to push in stack");
			x=sc.nextInt();
			s.push(x);
			break;
			
			case 2:
			y=s.pop();
			System.out.println("\nDeleted value is:"+y);
			break;
			
			case 3:
			System.out.println("\nThe Stack is:");
			s.disp();
			break;
			
			case 4:
			y=false;
			break;
			
			default:
			System.out.println("\nError");
			
		}
		
		}
		while(y==true);
		
	}
}