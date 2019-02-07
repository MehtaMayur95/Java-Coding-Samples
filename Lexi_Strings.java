
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Lexi_Strings{
 public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int len1=A.length();
        int len2=B.length();
        int sum=len1+len2;
        System.out.println(sum);
        int c=A.compareToIgnoreCase(B);
        if(c<=0)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
        System.out.print(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase());
        System.out.print(" "+B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase());
        
        
    }
	}