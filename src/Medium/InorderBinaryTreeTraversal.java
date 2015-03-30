/*
Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,3,2].
 * */

package Medium;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class InorderBinaryTreeTraversal {

	public List<Integer> inorder(TreeNode root){
		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		
		if(root == null) return lst;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		TreeNode p = root;

		while(!stack.isEmpty() || p!=null){
			if(p!=null){
				stack.push(p);
				p = p.left;
				
			}else{
				TreeNode t = stack.pop();
				lst.add(t.val);
				p = t.right;
			}
		}
		return lst;
	}
	
}
