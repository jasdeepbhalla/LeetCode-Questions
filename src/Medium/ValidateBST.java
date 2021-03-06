package Medium;



public class ValidateBST {

	public static boolean isValidBSt(TreeNode root){
		return validate(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static boolean validate(TreeNode root, int min, int max){
		if(root==null){
			return true;
		}
		
		if(root.val <=min || root.val >= max){
			return false;
		}
		return validate(root.left, min, root.val) && validate(root.right,root.val,max);
	}
	
	
	public static void main(String[] args) {
		
	}
}

