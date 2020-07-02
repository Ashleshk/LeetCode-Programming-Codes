package Week_02;

import java.util.*;

/*Contiguous Array
 
Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Example 1:
Input: [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
Example 2:
Input: [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
Note: The length of the given binary array will not exceed 50,000.
 * */
public class ContiguousArray {
	public static int findMaxLength(int[] nums) {
        int total = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int maxLength = 0;
        for(int index = 0; index < nums.length; index++) {
            total = total + (nums[index] == 0 ? -1 : 1);
            if(map.containsKey(total)) {
                maxLength = Math.max(maxLength, index - map.get(total));
            } else {
                map.put(total, index);
            }
        }
        return maxLength;
    }
	public static void main(String[] args) {
		int arr[]= {0,1};
		System.out.println(findMaxLength(arr));
	}
}
