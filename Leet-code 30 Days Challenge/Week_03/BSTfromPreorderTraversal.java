package Week_03;
/*Construct Binary Search Tree from Preorder Traversal
 
Return the root node of a binary search tree that matches the given preorder traversal.

(Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)

It's guaranteed that for the given test cases there is always possible to find a binary search tree with the given requirements.

Example 1:

Input: [8,5,1,7,10,12]
Output: [8,5,10,1,7,null,12]
 
Constraints:
1 <= preorder.length <= 100
1 <= preorder[i] <= 10^8
The values of preorder are distinct.
 * */
class TreeNode {
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
public class BSTfromPreorderTraversal {
	 public TreeNode bstFromPreorder(int[] preorder) {
	        if (preorder == null) {
	            return null;
	        }

	        return formBST(preorder, 0, preorder.length - 1);      
	    }

	    private TreeNode formBST(int[] nums, int low, int high) {
	        if (low > high) {
	            return null;
	        }

	        TreeNode node = new TreeNode(nums[low]);
	        if (low == high) {
	            return node;
	        }

	        int index = low + 1;
	        while (index <= high && nums[index] < nums[low]) {
	            index++;
	        }

	        node.left = formBST(nums, low + 1, index - 1);
	        node.right = formBST(nums, index, high);

	        return node;
	    }
}

 