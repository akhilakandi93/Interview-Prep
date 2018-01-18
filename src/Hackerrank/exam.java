package Hackerrank;
import java.util.*;
public class exam {

	public static void main(String[] args) {
		String[] words={"Alaska", "hello" ,"dad", "peace"};
		System.out.println(words[0].indexOf('h'));
		String[] result=findWords(words);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}
	
	
	public static String[] findWords(String[] words) {
		String[] chars={"qwertyuiop","asdfghjkl","zxcvbnm"};
		List<String> result=new ArrayList<String>();
        
		for(int i=0;i<words.length;i++){
			String str=words[i];
			str=str.toLowerCase();
			String s="";
			if(chars[0].indexOf(str.charAt(0))!=-1){
				s=chars[0];
			}else if(chars[1].indexOf(str.charAt(0))!=-1){
				s=chars[1];
			}else{
				s=chars[2];
			}
			int j=1;
        	for(j=1;j<str.length();j++){
        		if(s.indexOf(str.charAt(j)) ==-1){
        			break;
        		}
        	}
        	if(j==str.length())
        	result.add(str);
			
		}
		
        return (String[]) result.toArray(new String[result.size()]);
    }

}
