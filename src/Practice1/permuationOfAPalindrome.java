package Practice1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class permuationOfAPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="nithin";
			str=str.replaceAll("\\s+", "");
			HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
			for(int i=0;i<str.length();i++){
				char key=str.charAt(i);
				if(hmap.containsKey(key)){
					hmap.put(key, hmap.get(key)+1);
				}else{
					hmap.put(key,1);
				}
			}
			int count=0;
			Iterator it= hmap.entrySet().iterator();
			while(it.hasNext()){
				Map.Entry pair=(Entry) it.next();
				//String key=(String) pair.getKey();
				int value=(int) pair.getValue();
				if(value%2!=0){
					count++;
				}
			}
			if(count>1){
				System.out.println("Not a palindrome");
			}else{
				System.out.println("Its a palindrome");
			}
	}

}
