import java.util.*;
import java.io.*;
class Method2
{
	private int num1;
	private int num2;
	Method2(int n1,int n2)
	{
		num1=n1;
		num2=n2;
	}
	int sum()
	{
		int sum=num1+num2;
		//we need a method with return type and without parameters
		return sum;
	}
}
class Methodwithoutpara
{
	public static void main(String args[])
	{
		Method2 my2=new Method2(10,20);
		int disp=my2.sum();
		System.out.println("Answer is:"+disp);
		
	}
}