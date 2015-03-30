package Medium;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		int[] num= {2,7,11,15};
		int[] get;
	//	System.out.println(
				int[] index = twoSum(num,9);
				
				System.out.println(num[index[0]] +" "+ num[index[1]]);
		//		[1]+[2]);
		
	}

	public static int[] twoSum(int[] num, int target){
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2] ;
		for(int i=0; i<num.length;i++){
			
			if(map.containsKey(num[i])){
				int index = map.get(num[i]);
				result[0] = index+1;
				result[1] = i+1;
			}
			else{
				map.put(target-num[i], i);
			}
			
		}
		return result;
	}
	
	
}
