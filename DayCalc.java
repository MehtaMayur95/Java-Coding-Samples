import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.Calendar;
import java.time.LocalDate;
class DayCalc
{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String month=sc.next();
		String day=sc.next();
		String year=sc.next();
		LocalDate date=LocalDate.of(2018,1,25);
		System.out.println(date);
		//System.out.println("\nDay would be:"+date.getDayOfMonth());
}
}