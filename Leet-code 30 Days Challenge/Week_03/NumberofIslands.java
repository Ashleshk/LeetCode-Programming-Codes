package Week_03;
/*Number of Islands
 
Given a 2d grid map of '1's (land) and '0's (water), count the number
 of islands. An island is surrounded by water and is formed by 
 connecting adjacent lands horizontally or vertically. You may 
 assume all four edges of the grid are all surrounded by water.

Example 1:

Input:
11110
11010
11000
00000

Output: 1
Example 2:

Input:
11000
11000
00100
00011

Output: 3
 * */
public class NumberofIslands {
	 
	    static int[] xarr={-1,0,0,1};
	    static int[] yarr ={0,-1,1,0};
	    static boolean  isSafe(char[][] grid , int i , int j)
	    {
	        if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]=='1' )
	        {
	            return true;
	        }
	            
	        return false;
	    }
	    static void dfs(char[][] grid ,int i, int j)
	    {
	        for(int k=0;k<4;k++)
	        {
	            int next_i = i+xarr[k];
	            int next_j = j+yarr[k];
	            if(isSafe(grid,next_i,next_j))
	            {
	                grid[next_i][next_j] = '0';
	                dfs(grid,next_i , next_j);
	            }
	        }
	    }
	   
	    public static int numIslands(char[][] grid) {
	        int cnt =0;
	        for(int i=0;i<grid.length;i++)
	        {
	            for(int j=0;j<grid[0].length;j++)
	            {
	                if(grid[i][j]=='1'){
	                cnt++;
	                grid[i][j] = '0';
	                dfs(grid,i,j);
	                }
	            }
	        }
	        return cnt;
	    }
	    
	 public static void main(String[] args) {
		 char[][] arr = {{'1','1','0','0','0'},
				         {'1','1','0','0','0'},
				         {'0','0','1','0','0'},
				         {'0','0','0','1','1'}};
		System.out.println(numIslands(arr));
	}
}
