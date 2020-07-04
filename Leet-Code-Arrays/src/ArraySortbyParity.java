/*Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

 
Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 

Note:

1 <= A.length <= 5000
0 <= A[i] <= 5000

 * */
public class ArraySortbyParity {
	public static int[] sortArrayByParity(int[] A) {
		int temp=0,c=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]%2==0)
			{
				temp=A[c];
				A[c]=A[i];
				A[i]=temp;
				c++;
				
			}
		}
		return A;
	}
	public static void main(String[] args) {
		int A[]= {3,1,2,4};
		A=sortArrayByParity(A);
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
	}
}
