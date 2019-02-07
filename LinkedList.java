import java.util.*;
import java.util.Scanner;
import java.io.*;
class LinkedList1
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int choice=0;
	int pos,e;
	LinkedList<String> lt=new LinkedList<String>();
	//lt.add(43);
	//lt.add(44);
	System.out.println("\nDisp:"+lt);
	while(choice<4)
	{
		System.out.println("\nPress 1: To Add an Element");
		System.out.println("\nPress 2: To Delete an Element");
		System.out.println("\nPress 3: To Replace an Element");
		System.out.println("\nPress 4: To Exit");
		System.out.println("\nEnter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			System.out.println("\nEnter the element to be entered:");
			e=Integer.parseInt(sc.next());
			System.out.println("\nEnter the position:");
			pos=Integer.parseInt(sc.next());
			lt.add(pos-1,e);
			System.out.println("\nList is:"+lt);
			break;
			
			case 2:
			System.out.println("\nEnter the position:");
			pos=Integer.parseInt(sc.next());
			lt.remove(pos-1);
			System.out.println("\nList is:"+lt);
			break;
			
			case 3:
			System.out.println("\nEnter the new element:");
			e=Integer.parseInt(sc.next());
			System.out.println("\nEnter the position:");
			pos=Integer.parseInt(sc.next());
			lt.set(pos-1,e);
			System.out.println("\nList is:");
			break;
			
			default:
			System.out.println("\nenter valid option:");
		}
	}
}

}