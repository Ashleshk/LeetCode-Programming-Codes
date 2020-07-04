/*Move Zeroes
 
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 * */
public class MoveZeros {
	 public static void moveZeroes(int[] nums) {
	        int cnt=0;
	        int n =nums.length;
	        for(int i=0;i<n;i++)
	        {
	        	if(nums[i]==0)
	        		cnt++;
	        	else
	        		nums[i-cnt]=nums[i];
	        }
	        for(int i=n-1;i>n-cnt-1;i--)
	        	nums[i]=0;
	    
	    }
	 public static void main(String[] args) {
		int ar[] = {0,1,0,3,12};
		moveZeroes(ar);
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i] + " ");
		}
	}
}
