import java.io.*;
import java.util.*;
import java.util.Scanner;
public class instance
{
	String name;
	int age;
	float salary;
	
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the name:");
		name=sc.nextLine();
		System.out.println("\nEnter the age:");
		age=sc.nextInt();
		System.out.println("\nEnter the salary:");
		salary=sc.nextFloat();
		
	}
	void putdata()
	{
		System.out.println("\nName is:"+name);
		System.out.println("\nage is:"+age);
		System.out.println("\nsalary is:"+salary);
	}
	
	public static void main(String args[])
	{
		instance a=new instance();
		a.getdata();
		a.putdata();
	}
}