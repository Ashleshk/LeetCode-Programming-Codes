package Week_04;

import java.util.*;

/* Subarray Sum Equals K
 
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:

Input:nums = [1,1,1], k = 2
Output: 2
 

Constraints:

The length of the array is in range [1, 20,000].
The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
   Hide Hint #1  
Will Brute force work here? Try to optimize it.
   Hide Hint #2  
Can we optimize it by using some extra space?
   Hide Hint #3  
What about storing sum frequencies in a hash table? Will it be useful?
   Hide Hint #4  
sum(i,j)=sum(0,j)-sum(0,i), where sum(i,j) represents the sum of all the elements from index i to j-1. Can we use this property to optimize it.
 * */
public class SubArraySumEqualsK {
	public static int subarraySum(int[] nums, int k) {
        int curr_sum=0;
        int cnt=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            curr_sum += nums[i];
            if(map.containsKey(curr_sum-k))
            {
                cnt +=map.get(curr_sum -k);
            }
            map.put(curr_sum,map.getOrDefault(curr_sum,0)+1);
        }
        return cnt;
    }
	public static void main(String[] args) {
		//int nums[]= {1,1,1};
		int nums[] = {3,4,7,2,-3,1,4,2,1};
		int k=7;
		System.out.println(subarraySum(nums, k));
	}
}
