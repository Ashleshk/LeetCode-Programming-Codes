package Week_03;
/*Minimum Path Sum
 
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Example:

Input:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
Output: 7
Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 * */
public class MinimumPathSum {
	    public static int minPathSum(int[][] grid) {
	        int[][] dp = new int[grid.length][grid[0].length];
	        for(int i=0;i<grid.length;i++)
	        {
	            for(int j=0;j<grid[0].length;j++)
	            {
	                dp[i][j]=-1;
	            }
	        }
	        return minCost(grid,0,0,dp);
	    }
	    static int minCost(int[][] grid , int i,int j,int[][] dp)
	    {
	        if(i==grid.length-1 && j==grid[0].length-1)
	        {
	            return grid[i][j];
	        }
	        if(i==grid.length || j==grid[0].length)
	        {
	            return Integer.MAX_VALUE;
	        }
	        if(dp[i][j]!=-1)
	        {
	            return dp[i][j];
	        }
	        return  dp[i][j]=Math.min(minCost(grid,i+1,j,dp),minCost(grid,i,j+1,dp))+grid[i][j];
	    }
	    public static void main(String[] args) {
			 int[][] arr = {{1,3,1},
					 		{1,5,1},
				  			{4,2,1}};
			System.out.println(minPathSum(arr));
		}
	 
}
