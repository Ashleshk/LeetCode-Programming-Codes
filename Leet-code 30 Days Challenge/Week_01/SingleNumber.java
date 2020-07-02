package Week_01;

import java.util.Scanner;

/*  Single Number
 
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.

	Note:
	
	Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
	
	Example 1:
	
	Input: [2,2,1]
	Output: 1
	Example 2:
	
	Input: [4,1,2,1,2]
	Output: 4*/
public class SingleNumber {
	 public static int singleNumber(int[] nums) {
		    int a = 0;
		    for (int i : nums) {
		      a ^= i;
		    }
		    return a;
		  }
	 
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
           
        }
        System.out.println(singleNumber(a));
	}
}
