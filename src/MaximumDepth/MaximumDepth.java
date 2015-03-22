package MaximumDepth;

import java.util.ArrayList;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int d){
		val = d;
	}
}

//Recursion Based
public class MaximumDepth {

	public int maxDepth(TreeNode root){

		if(root == null)
			return 0;
		return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
	}
	

	
	//1. Recursive:
	
		/**
		 * Definition for binary tree
		 * public class TreeNode {
		 *     int val;
		 *     TreeNode left;
		 *     TreeNode right;
		 *     TreeNode(int x) { val = x; }
		 * }
		 */
		    public int maxDepthR(TreeNode root) {
		        if(root == null)    return 0;
		         
		        return getDepth(root, 1);
		    }
		     
		    public int getDepth(TreeNode node, int depth) {
		        int left = depth, right = depth;
		        if(node.left != null) left = getDepth(node.left, depth + 1);
		        if(node.right != null) right = getDepth(node.right, depth + 1);
		         
		        return left > right ? left : right;
		    }

	//	2. Non-recursive:

		/**
		 * Definition for binary tree
		 * public class TreeNode {
		 *     int val;
		 *     TreeNode left;
		 *     TreeNode right;
		 *     TreeNode(int x) { val = x; }
		 * }
		 */
		    public int maxDepthNR(TreeNode root) {
		        if(root == null)    return 0;
		         
		        // Non-recursive, use level order triversal
		        ArrayList<TreeNode> q = new ArrayList<TreeNode>();
		        q.add(root);
		        int depth = 0;
		         
		        while(!q.isEmpty()) {
		            ArrayList<TreeNode> next = new ArrayList<TreeNode>();
		            for(TreeNode node : q) {
		                if(node.left != null)   next.add(node.left);
		                if(node.right != null)  next.add(node.right);
		            }
		            q = new ArrayList<TreeNode>(next);
		            depth++;
		        }
		         
		        return depth;
		    }
}

