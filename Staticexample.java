import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staticexample {
	public static int B;
	public static int H;
	static boolean flag=false;
	static Scanner sc=new Scanner(System.in);
	static{
		B=sc.nextInt();
		H=sc.nextInt();
		if(B<=0 || H<=0)
	{
		System.out.println("\njava.lang.Exception: Breadth and height must be positive");
	}
	else{
		flag=true;
	}
	}
	
	public static void main(String args[])
	{
		if(flag)
		{
			int area=B*H;
			System.out.println(area);
		}
	}
}