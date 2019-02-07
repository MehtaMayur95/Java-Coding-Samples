import java.util.*;
import java.io.*;
import java.util.Scanner;
class Method1
{
	
		private String name;
		private int age;
		Method1(String n,int a)
		{
			name=n;
			age=a;
		}
		void call()
		{
			System.out.println("Your name is:"+name);
			System.out.println("Your age is:"+age);
			
		}
		

}
class Methodexample1
{
	public static void main(String args[])
	{
		Method1 my=new Method1("Mayur",22);
		my.call();
	}
}