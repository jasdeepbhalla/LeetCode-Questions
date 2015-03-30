package Medium;

import java.util.Stack;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int d){
		val = d;
	}
}

public class FlattenBinaryTree2LinkedList {
	
	public static void main(String[] args) {
		
	}

	public static void flattenBinTree2LList(TreeNode root){
	
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p = root;
		
		while(p!=null || !stack.isEmpty()){
			
			if(p.right!=null){
				stack.push(p.right);
			}
			
			if(p.left!=null){
				p.right = p.left;
				p.left =null;
			}
			else if(!stack.isEmpty()){
				TreeNode temp = stack.pop();
				p.right = temp;
			}
			
			p = p.right;
		}
		
	}
	
}
