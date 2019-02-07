import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.math.*;
class CurrencyFormatter
{
	public static void main(String args[])
	{
		/*double n,j;
		Scanner sc=new Scanner(System.in);
		n=sc.nextDouble();
		numFormat=new DecimalFormat("'$'00.####");
		j=numFormat.format(n);
		System.out.println(j);
		*/
		
        DecimalFormat numFormat;
		String number;

// 2 digits before decimal point and then 2 digits (rounded)
numFormat = new DecimalFormat("000.##");
number = numFormat.format(-15.567);
System.out.println("1. DecimalFormat with .: " + number);

// string '$' in front of the number
numFormat = new DecimalFormat("'$'00.####");
number = numFormat.format(15.567);
System.out.println("2. DecimalFormat with '$': " + number);


         

	}
}