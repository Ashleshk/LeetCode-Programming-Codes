/*Replace Elements with Greatest Element on Right Side
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

 

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
 

Constraints:

1 <= arr.length <= 10^4
1 <= arr[i] <= 10^5
 * */
public class ReplaceValuebyMaxfromRight {
	public static int[] replaceElements(int[] arr) {
        
        for(int i=0;i<arr.length;i++)
        {   
            int maxsofar=0;
            for(int j=arr.length-1;j>i;j--)
            {
              if(maxsofar<arr[j])
                  maxsofar=arr[j];
                
            }
            arr[i]=maxsofar;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
	public static void main(String[] args) {
		int res[] ={17,18,5,4,6,1};
		res= replaceElements(res);
		for(int i=0; i< res.length;i++)
			System.out.print(res[i]+" ");
	}
}
