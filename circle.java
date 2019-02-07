import java.io.*;
import java.util.*;
import java.util.Scanner;

public class circle
{
	double radius;
	double x;
	double y;

circle(double r)
{
	radius=r;
	System.out.println("\nThe circle is at origin");
}
circle(double c1,double c2,double r)
{
	x=c1;
	y=c2;
	radius=r;
	System.out.println("\ncordinate x is:"+c1);
	System.out.println("\ncordinate y is:"+c2);
	System.out.println("\nradius is:"+r);
}
void area()
{
	double PI=3.14;
	double sum;
	sum=(PI*radius*radius);
	System.out.println("\nArea is:"+sum);
	
}

public static void main(String args[])
{
	circle c=new circle(20);
	c.area();
	circle d=new circle(10,20,25);
	d.area();
}
}
