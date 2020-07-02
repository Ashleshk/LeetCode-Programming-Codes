package Week_02;
/*
 * Diameter of Binary Tree
 
Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.
 * */
class TreeNode{
	 int val;
	  TreeNode left;
	  TreeNode right;
	  TreeNode() {}
	  TreeNode(int val) { this.val = val; }
	  TreeNode(int val, TreeNode left, TreeNode right) {
	      this.val = val;
	    this.left = left;
	      this.right = right;
	  }
}
public class DiameterofBinaryTree {
	int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return res;
    }
    public int diameter(TreeNode root){
        if(root!=null){
            int left=diameter(root.left);
            int right=diameter(root.right);
            res=Math.max(res, left+right);
            return 1+Math.max(left,right);
        }
        return 0;
    }
    public static void main(String[] args) {
		
	}
    
}
