/*Check If N and Its Double Exist
Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

More formally check if there exists two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 

Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 * */
public class CheckifNandItsDoubleExist {
	 public static boolean checkIfExist(int[] arr) {
	        for(int i=0;i<arr.length;i++)
	        {
	            int right=arr.length-1;
	            while(i<right)
	            {
	              if(arr[i]==2*arr[right])
	                  return true;
	              else if(arr[i]*2 == arr[right])
	                  return true;
	              else
	                  right--;
	            }
	        }
	        return false;
	        
	    }
	 public static void main(String[] args) {
		int[] arr= {10,2,5,3};
		System.out.println(checkIfExist(arr));
	}
}
