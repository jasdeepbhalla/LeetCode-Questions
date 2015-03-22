package SingleNumber;

public class SingleNumber {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,4};
		System.out.println(singleNo(arr));
	}
	
	public static int singleNo(int[] n){
		int x=0;
		for(int a:n){
			x = x^a;
		}
		return x;
	}

}
