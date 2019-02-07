import java.io.*;
import java.util.*;
class ReturnCheck
{
	public static void main(String args[])
	{
		int num=1;
		String letter="abc";
		num=Num(num);
		letter=letter(letter);
		System.out.println("Num is:"+num);
		System.out.println("String is:"+letter);
	}
	public static int Num(int num)
	{
		num++;
		return num;
	}
	public static String letter(String letter)
	{
		letter+= "d";
		return letter;
	}
}
