package Easy;




public class SameTree {

	
	public boolean isSymmetric(TreeNode a, TreeNode b){

		if(a==null) return b == null;
		if(b==null) return false;
		if(a.val != b.val) return false;
		if(!isSymmetric(a.left,b.left)) return false;
		if(!isSymmetric(a.right,b.right)) return false;

		return true;
	}
	
}
