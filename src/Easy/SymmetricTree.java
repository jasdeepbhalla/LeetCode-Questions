/*
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
For example, this binary tree is symmetric:
    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
Note: Bonus points if you could solve it both recursively and iteratively.
 * 
 * 
 * 
 * */


package Easy;

import java.util.LinkedList;


public class SymmetricTree {

	public boolean isSymmetric(TreeNode root){
		if(root == null) return true;
		return isSymmetric(root.left, root.right);
	}

	//recursion based
	public boolean isSymmetric(TreeNode a, TreeNode b){

		if(a==null) return b == null;
		if(b==null) return false;
		if(a.val != b.val) return false;
		if(!isSymmetric(a.left,b.right)) return false;
		if(!isSymmetric(a.right,b.left)) return false;

		return true;
	}

	//iterative
	public boolean isSymmetricIterative(TreeNode root){

		if(root==null) return true;

		LinkedList<TreeNode> leftNode = new LinkedList<TreeNode>();
		LinkedList<TreeNode> rightNode = new LinkedList<TreeNode>();

		leftNode.add(root.left);
		leftNode.add(root.right);

		while(!leftNode.isEmpty() && !rightNode.isEmpty()){
			TreeNode temp1 = leftNode.poll();
			TreeNode temp2 = rightNode.poll();

			if(temp1 == null && temp2 != null || temp1 != null && temp2 == null)
				return false;

			if(temp1 != null){
				if(temp1.val != temp2.val)
					return false;
				leftNode.add(temp1.left);
				leftNode.add(temp1.right);
				rightNode.add(temp2.right);
				rightNode.add(temp2.left);
			}
		}

		return true;
	}
}
