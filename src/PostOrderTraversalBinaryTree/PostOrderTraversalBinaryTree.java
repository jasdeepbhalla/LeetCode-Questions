
//http://cauchyhuang.blogspot.com/2014/06/binary-tree-preorderinorderpostorder.html
package PostOrderTraversalBinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int d){
		val = d;
	}
}

public class PostOrderTraversalBinaryTree {

	public List<Integer> postOrder(TreeNode root){
		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		
		if(root==null) return lst;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		stack.push(root);
		
		
		return lst;
	}
}
