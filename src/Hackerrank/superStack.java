package Hackerrank;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class superStack {

	ArrayList<Integer> stack;
	
	superStack(){
		stack=new ArrayList<Integer>();
	}
	
	public void push(int val){
		stack.add(val);
		System.out.println(val);
	}
	
	public void pop(){
		if(stack.size()>0){
			stack.remove(stack.size()-1);
		}else{
			System.out.println("Empty");
		}
	}
	
	public void inc(int till, int val){
		for(int i=0;i<till && i<stack.size();i++){
			stack.add(i, stack.get(i)+val);
		}
		System.out.println(stack.get(stack.size()-1));
	}
	
}

class test{
	
	public static void main(String args[]){
		TreeMap tm=new TreeMap();
		Entry pair=tm.lastEntry();
		Scanner in=new Scanner(System.in);
		superStack stack=new superStack();
		int total=in.nextInt();
		while(in.hasNext()){
			String instruction=in.nextLine();
			String[] words=instruction.split("\\s+");
			if(words.length==2){
				if(words[0].toLowerCase().equals("push")){
					stack.push(Integer.parseInt(words[1]));
				}else{
					stack.pop();
				}
			}else{
				stack.inc(Integer.parseInt(words[1]), Integer.parseInt(words[2]));
			}
		}
		
	}
}
