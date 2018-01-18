package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class longestSubstringwithAtLeastKRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ababacb";
		//System.out.println(longestSubstring(s,3));
		int[] nums={5,4,3,2,1,0};
		Arrays.sort(nums, 0, 4);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
	}

	private static int longestSubstring(String s,int k) {
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
			for(int i=0;i<s.length();i++){
				char ch=s.charAt(i);
				if(hmap.containsKey(ch)){
					hmap.put(ch, hmap.get(ch)+1);
				}else{
					hmap.put(ch, 1);
				}
			}
			Iterator it=hmap.entrySet().iterator();
			while(it.hasNext()){
				Map.Entry pair=(Map.Entry)it.next();
				int value=(int)pair.getValue();
				//System.out.println(value);
				if(value<k){
					it.remove();
				}
			}
			//System.out.println(hmap);
			if(hmap.size()==0){
				return 0;
			}
			int len=0,mark=0;
			int max=Integer.MIN_VALUE;
			for(int i=0;i<s.length();i++){
				char c=s.charAt(i);
				if(hmap.containsKey(c)){
					len++;
					if(len>max){
						max=len;
					}
				}else{
					len=0;
				}
			}
			
		    return max;
	}
	
}
