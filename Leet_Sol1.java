import java.io.*;
import java.util.*;
import java.util.Scanner;
class Solution {
    public int[] twoSum(int[] nums, int target) {
		
		//int[] nums={3,2,7,15};
        //int target=9;
        for(int i=0;i<=nums.length;i++)
        {
            if(nums[i]+nums[i+1]==target)
            {
                System.out.println("got it");
                break;
            }
            else
            {
                System.out.println("Didnt got it");
            }
        }
		return 0;
	}
				
		
class Leet_Sol1 {
	public static void main(String args[])
	{
     Solution sol=new Solution();
		sol.twoSum({3,2,7,15},9);
    }
	}