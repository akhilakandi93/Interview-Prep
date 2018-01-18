package Practice1;

import java.util.HashSet;
import java.util.Set;

public class CheckUniqueCharcatersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Akhila";
		StringBuilder sb=new StringBuilder();
		//sb.append(str.charAt(0));
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(sb.toString().indexOf(ch)>=0){
				System.out.println("Not Unique");
				System.exit(1);
			}else{
				sb.append(ch);
			}
		}
		System.out.println("unique");

	}

}
