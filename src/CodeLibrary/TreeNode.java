package CodeLibrary;


public class TreeNode {

	public int data ;
	public TreeNode left;
	public TreeNode right;
	public TreeNode parent;

	public TreeNode(int d){
		data = d;
	}

	public void setLeftChild(TreeNode left){
		this.left = left;
		if(left != null){
			left.parent = this;
		}
	}


	public void setRightChild(TreeNode right){
		this.right = right;
		if(right != null){
			right.parent = this;
		}
	}

	public void insertInOrder(int d){
		if(d<data){
			if(left==null){
				setLeftChild(new TreeNode(d));
			}
			else{
				left.insertInOrder(d);
			}
		}else{
			if(right == null){
				setRightChild(new TreeNode(d));
			}else{
				right.insertInOrder(d);
			}

		}

	}

	public boolean isBST(){
		return true;
	}

	public int height(){
		return 1;

	}

	public TreeNode find(int d){

		return null;
	}

	private static TreeNode addToTree(int arr[], int start, int end){
		if(end<start){
			return null;
		}
		int mid = (start+end)/2;
		TreeNode n = new TreeNode(arr[mid]);
		n.left = addToTree(arr,start,mid-1);
		n.right = addToTree(arr, mid+1, end);
		return n;
	}

	public static TreeNode createMinimalBST(int array[]){
		return addToTree(array,0,array.length-1);
	}

}
