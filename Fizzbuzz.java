import java.io.*;
import java.util.Scanner;
import java.util.*;

class Fizzbuzz
{
	public static void main(String args[])
	{
	
	for(int i=0;i<=50;i++)
	{
		if(i%(3*5)==0)
			System.out.println("FIZZBUZZ");
		else if(i%3==0)
			System.out.println("Fizz");
		else if(i%5==0)
			System.out.println("Buzz");
		else
			System.out.println(+i);
	}
	}
}