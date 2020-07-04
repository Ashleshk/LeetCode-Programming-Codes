/*Duplicate Zeros
 
Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.

 

Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
 

Note:

1 <= arr.length <= 10000
0 <= arr[i] <= 9
 * */
public class DuplicateZeros {
	 public void duplicateZeros(int[] arr) {
         
	        int count = 0;
	        int i = 0;
	        for( ; i < arr.length; i++) {
	            if (arr[i] == 0)
	                count += 2;
	            else
	                count += 1;
	            
	            if (count >= arr.length)
	                break;
	        }
	        int start = arr.length-1;
	        if (count > arr.length) {
	            arr[arr.length-1] = arr[i--];
	            start -= 1;
	        }
	        for(int j = start; j >= 0;) {
	            if (arr[i] == 0) {
	                arr[j--] = 0;
	                arr[j--] = 0;
	            }
	            else
	                arr[j--] = arr[i];
	            
	            i--;
	        }
	    }
}
