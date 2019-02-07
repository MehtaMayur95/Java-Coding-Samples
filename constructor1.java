import java.io.*;
import java.util.*;
import java.util.Scanner;
public class constructor1
{
	String name;
	int age;
	float salary;
	
	constructor1()
	{
		Scanner sc=new Scanner(System.in);
		name=this.name;
		age=this.age;
		salary=this.salary;
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
		constructor1 c=new constructor1();
		//c.constructor();
		c.putdata();
	}
}