package Hackerrank;
import java.util.*;
public class validateParanthesis {
// aAAb  abAB
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eq="aB";
		System.out.println(checkValidity(eq));
	}

private static boolean checkValidity(String eq) {
	Stack<Character> st=new Stack<Character>();
	for(int i=0;i<eq.length();i++){
		int tmp=(int)eq.charAt(i);
		if(tmp>96 && tmp<123){
			st.push(eq.charAt(i));
		}else if(tmp>43 && tmp<70){
			if(st.size()>0){
				st.pop();
			}else{
				return false;
			}
		}
	}
	return st.size()==0 ? true:false;
}

}
