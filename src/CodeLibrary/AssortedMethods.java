package CodeLibrary;


public class AssortedMethods {

	public static int randomInt(int n){
		return (int)(Math.random()*n);
	}

	public static int randomIntInRange(int min,int max){
		return randomInt(max+1-min)+min;
	}

	public static int[][] randomMatrix(int M, int N, int min, int max){
		int[][] matrix = new int[M][N];
		for(int i = 0; i< M; i++){
			for(int j = 0; j< N; j++)
				matrix[i][j] = randomIntInRange(min,max);
		}
		return matrix;
	}

	public static int[] randomArray(int N, int min, int max){
		int[] array = new int[N];
		for(int j=0; j<N ; j++){
			array[j] = randomIntInRange(min, max);
		}
		return array;
	}

	public static LinkedListNode randomLinkedList(int N, int min, int max){
		LinkedListNode  root = new LinkedListNode(randomIntInRange(min,max),null,null);
		LinkedListNode prev = root;
		for(int i=1; i<N; i++){
			int data = randomIntInRange(min,max);
			LinkedListNode next = new LinkedListNode(data, null, null);
			prev.setNext(next);
			prev = next ; 
		}
		return root;
	}
/*
	public static String IntArrayToString(int[] array){

	}

	public static String StringArrayToString(int[] array){

	}
	
	public static String IntToFullBinaryString(int a){
		
	}

	public static void printMatrix(int[][] matrix) {
		
	}
	
	public static String charArrayToString(char[] array) {
		
	}
	
	public static String listOfPointsToString(ArrayList<Point> list) {
		
	}
	
	public static String listOfPointsToString(ArrayList<Point> list) {
		
	}
	
	public static TreeNode randomBST(int N, int min, int max) {
		
	}

	// Creates tree by mapping the array left to right, top to bottom. 
	public static TreeNode createTreeFromArray(int[] array) {
		
	}
	
	public static String getLongTextBlob() {
		
	}
	
	public static String[] getLongTextBlobAsStringList() {
		
	}
	*/
}
