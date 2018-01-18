package StacksAndQueues;

import java.util.LinkedList;
import java.util.Stack;

public class minStack {
	 Stack<Integer> stack=new Stack<Integer>();
		int min=Integer.MAX_VALUE;
		Stack<Integer> minstack=new Stack<Integer>();
		
		    public void push(int x) {
		        if(x<=min){
		        	min=x;
		        	minstack.push(x);
		        }
		        stack.push(x);
		    }
		    
		    public void pop() {
		        if(stack.peek()==min){
		        	minstack.pop();
		        	if(!minstack.isEmpty()){
		        	    min=minstack.peek();
		        	}
		        }
		        stack.pop();
		        if(stack.isEmpty() || minstack.isEmpty()){
		        	min=Integer.MAX_VALUE;
		        }
		    }
		    
		    public int top() {
		       return stack.peek(); 
		    }
		    
		    public int getMin() {
		        return min;
		    }
		    
	    
}
 
	

