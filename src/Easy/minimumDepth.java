package Easy;

import java.util.LinkedList;


public class minimumDepth {

	public static int minDepth(TreeNode root){

		if(root == null) return 0;

		LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
		LinkedList<Integer> counts = new LinkedList<Integer>();

		nodes.add(root);
		counts.add(1);

		while(!nodes.isEmpty()){

			TreeNode cur = nodes.remove();
			int count = counts.remove();

			if(cur.left != null){
				nodes.add(cur.left);
				counts.add(count+1);
			}
			
			if(cur.left != null){
				nodes.add(cur.right);
				counts.add(count+1);
			}

			if(cur.left == null && cur.right == null){
				return count;
			}

		}
		return 0;
	}

}
