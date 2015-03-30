package Medium;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		System.out.println(reverseWords("My Name is Jasdeep"));
	}
	
	public static String reverseWords(String S){
		
		if(S==null || S.length()==0)
			return "";		
		
		String[] Arr = S.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=Arr.length-1; i>=0; --i){
			if(!Arr[i].equals("")){
				sb.append(Arr[i]).append(" ");
			}
		}
		return sb.length()==0?"":sb.substring(0,sb.length()-1);
	}
	

}
