import java.util.Stack;

//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//
//push(x) -- Push element x onto stack.
//pop() -- Removes the element on top of the stack.
//top() -- Get the top element.
//getMin() -- Retrieve the minimum element in the stack.
//
//
//Working Fine

public class MinStack {
	
	Stack<Integer> minStack = new Stack<Integer>();
	Stack<Integer> stack = new Stack<Integer>();
	
	
	public void push(int x){
		if(minStack.isEmpty() || x <= minStack.peek()){
			minStack.push(x);
		}
		stack.push(x);
	}
	
	public void pop(){
		if(getMin() == stack.peek())
			minStack.pop();
		stack.pop();
		
	}
	
	public int top(){
		return stack.peek();
	}
	
	public int getMin(){
		return minStack.peek();
		
	}

	
	public static void main(String[] args) {
		MinStack p = new MinStack();
		p.push(7);
		p.push(9);
		p.push(4);
		p.push(24);
		p.pop();
		p.pop();
	System.out.println(p.top());
	System.out.println(p.getMin());
	}
}
