import java.util.*;
import java.io.*;
class Lambdatry
{
	public static void main(String args[])
	{
		//ArrayList<String> ar1 =new ArrayList<String>();
		ArrayList[] list = new ArrayList[10];
	for(int i=0; i<5; i++)
	{
		list[i] = new ArrayList<String>();
	}	
	for(int i=0;i<list.length;i++)
	{
		System.out.println(list[i]);
	}
		
	}
}