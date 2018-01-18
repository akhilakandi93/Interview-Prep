package Practice1;

import java.util.HashMap;

public class permutationInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkInclusion("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdef"
				,"bcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefg"
				));
	}
	public static boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
        HashMap<Character,Integer> temp=new HashMap<Character,Integer>();
        for(int i=0;i<s1.length();i++){
        	char c=s1.charAt(i);
        	if(hmap.containsKey(c)){
        		hmap.put(c,hmap.get(c)+1);
        		temp.put(c,hmap.get(c)+1);
        		
        	}else{
        		hmap.put(c, 1);
        		temp.put(c, 1);
        	}
        }
        System.out.println(hmap);
       // temp=hmap;
        System.out.println(temp);
        int count=s1.length();
        
        
        for(int i=0;i<s2.length();i++){
        	char c=s2.charAt(i);
        	if(temp.containsKey(c)){
        		System.out.println(temp);
        		temp.put(c, temp.get(c)-1);
        		System.out.println("test");
        		if((s2.length()-i)>=s1.length()){
        		for(int j=i+1;j<s2.length();j++){
        			char t=s2.charAt(j);
        			if(temp.containsKey(t)){
                		System.out.println("test "+" c="+c+ " "+temp.get(t));
        				if(temp.get(t)>0){
        					count--;
        					System.out.println("test");
            					temp.put(t, temp.get(t)-1);
        				}else{
        					break;
        				}
        			}else{
        				break;
        			}
        		}

        		System.out.println(count);
        		if(count==1){
        			
        			
        			return true;
        		}else{
        			count=s1.length();
        		}
        		System.out.println("testing");
        		temp.putAll(hmap);
        		System.out.println(temp+" "+hmap);
        		}else{
        			System.out.println("from here");
        			return false;
        		}
        		
        	}
        	
        }
		return false;
    }

}
