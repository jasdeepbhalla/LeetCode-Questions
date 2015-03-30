package Medium;

public class MaximumSubarray {
	
	public static void main(String[] args) {
		int[] B = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSumofSubArray(B));
	}

	public static int maxSumofSubArray(int[] A){
		
		int newSum = A[0];
		int max = A[0];
		
		for(int i=1; i< A.length; i++){
			newSum = Math.max(newSum+A[i], A[i]);
			max = Math.max(max, newSum);
		}
		return max;
	}
}
