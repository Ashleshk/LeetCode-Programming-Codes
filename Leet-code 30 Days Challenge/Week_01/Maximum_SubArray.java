package Week_01;

import java.util.Scanner;

/*Maximum Subarray

Solution
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 * */
public class Maximum_SubArray {
	
	public static int maxSubArray(int[] nums) {
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            curr_sum+=nums[i];
            max_sum=Math.max(max_sum,curr_sum);
            curr_sum=Math.max(curr_sum,0);
        }
        return max_sum;
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
       System.out.println(maxSubArray(a));
}
}
