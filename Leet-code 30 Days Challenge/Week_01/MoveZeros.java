package Week_01;
/*Move Zeroes

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.*/
import java.util.Scanner;

public class MoveZeros {
	public static void moveZeroes(int[] nums) {
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
                cnt++;
            else{
                nums[i-cnt]=nums[i];
            }
        }
        for(int i=n-1;i>n-1-cnt;i--)
        {
            nums[i]=0;
        }
    
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
	       System.out.println("Original Array : ");
	       for(int i = 0; i < n; i++)
	       {
	           System.out.print(a[i]+ " ");
	          
	       }
	        moveZeroes(a);
	        System.out.println("new Array : ");
		       for(int i = 0; i < n; i++)
		       {
		           System.out.print(a[i]+ " ");
		          
		       }
		
	}
}
