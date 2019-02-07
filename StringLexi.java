import java.util.*;
import java.io.*;
import java.util.Scanner;
class StringLexi
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int k=sc.nextInt();
	/*int length=s.length();
	
	char[] chars1=new char[20];
	for(int i=0;i<=length;i++)
	{
		String s1=s.substring(i,n);
		chars1=s1.toCharArray();
		System.out.println(chars1);
		n++;
		if(n>length)
			break;
	}*/
	//System.out.println(chars1.length);
	String smallest = s.substring(0, k);
    String largest = s.substring(s.length()-k, s.length());

    for ( int i = 0; i < s.length() - k + 1; i++)
            {
        if ( s.substring(i, i + k).compareTo(smallest) < 0)
                    {
            smallest = s.substring(i, i + k);
        } 
                    else if ( s.substring(i, i + k).compareTo(largest) > 0 ) 
                    {
            largest = s.substring(i, i + k);
        }
    }
	System.out.println(smallest);
	System.out.println(largest);
	
	
}
}




