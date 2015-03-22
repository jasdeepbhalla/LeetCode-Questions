/**
 * 
Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].

 */


package PreOrderTraversalBinaryTree;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
}

public class PreOrderTraversalBinaryTree {
	
	public List<Integer> preOrder(TreeNode root){
		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		if(root==null) return lst;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		
		while(!stack.isEmpty()){
			
			TreeNode n = stack.pop();
			lst.add(n.val);
			
			if(n.right != null) 
				stack.push(n);
			
			if(n.left != null)
				stack.push(n);
		}
		return lst;
	}

}
