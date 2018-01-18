package Practice1;

import java.util.Stack;

 class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="([{}])";
		Stack<Character> s=new Stack<Character>();
		for(char c: str.toCharArray()){
			if(c=='{'){
				s.push('}');
			}else if(c=='['){
				s.push(']');
			}else if(c=='('){
				s.push(')');
			}else if(s.isEmpty() || s.pop()!=c){
				System.out.println("false");
			}
		}
		System.out.println(s.isEmpty());
	}

}
