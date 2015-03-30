package Medium;

public class FindPeakElement {
	
	public static void main(String[] args) {
		int[] num = {0,2,5,1,3};
		System.out.println(num[findPeakIndex(num)]);
	}
	
	public static int findPeakIndex(int[] num){
		int index=0;
		int max=num[0];
		for(int i=1; i<=num.length-2;i++){
			int prev = num[i-1];
			int curr = num[i];
			int next = num[i+1];
			
			if(curr>prev && curr>next && curr>max){
				index = i;
				max = curr;
			}
		}
		
		if(num[num.length-1]>max)
			return num.length-1;
		return index;
	}

}
