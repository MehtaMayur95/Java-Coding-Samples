import java.io.*;
import java.util.*;
import java.util.Scanner;

public class HashsetUnique {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) 
		{
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
		String [] Whole_pair=new String[t];
		for(int i=0;i<t;i++)
		{
				Whole_pair[i]=pair_left[i]+pair_right[i];
		}
		
		HashSet<String> hs=new HashSet<String>();
		for(int i=0;i<t;i++)
		{
			hs.add(Whole_pair[i]);
		}
		Iterator it=hs.iterator();
		for(String m:hs)
		{
			String m1=(String)it.next();
			System.out.println(m1);
		}
		
 }
}