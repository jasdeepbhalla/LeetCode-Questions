/*Use stack to record  '('  position, then check current valid length when a ')' come.
then, max length valid Parentheses is decided by two situation
1) stack is not empty, so the current length is current position i- last second position of '(' in stack, we can calculate it
through stack.pop(), then i-stack.peek() and check the length with max
2) stack is empty, then the longest length we can check currently is i-last (last is the position of last invalid ')')
 * */


package Difficult;

import java.util.Stack;

public class LongestValidParentheses {
	
	public static void main(String[] args) {
		System.out.println(LongestValidP(")()()"));
	}
	
	public static int LongestValidP(String s){
		
		//case 1
		if(s==null||s.length()==0){
			return 0;
		}
		
		//
		int last = -1;
		int maxLen = 0 ;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<s.length();i++){
			
			if(s.charAt(i)=='(')
				stack.push(i);
			else
			{
				 if (stack.isEmpty()){
	                    // record the position before first left parenthesis
	                    last=i;
	                }
	                else{
	                    stack.pop();
	                    
	                    // if stack is empty mean the positon before the valid left parenthesis is "last"
	                    if (stack.isEmpty()){
	                        maxLen=Math.max(i-last, maxLen);
	                    }
	                    else{
	                      // if stack is not empty, then for current i the longest valid parenthesis length is 
	                      // i-stack.peek()
	                       maxLen=Math.max(i-stack.peek(),maxLen);  
	                    }
					
				}
				
			}
			
		}
		
		
		return maxLen;
		
	}

}
