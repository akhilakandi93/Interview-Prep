package LeetCode;

import java.util.Arrays;
import java.util.*;

class nums implements Comparable{
String num;
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return ((String)o+num).compareTo(num+(String)o);
	}
	
}
public class largestNumPossible{
	
	public static void main(String args[]){
		int[] nums={10,68,75,7,21,12,385};
		String s=Arrays.toString(nums);
		s=s.replaceAll("\\[|\\]|\\s+|,", "");
		System.out.println(s);
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		String[] str=new String[nums.length];
		for(int i=0;i<str.length;i++){
			str[i]=String.valueOf(nums[i]);
		}
		Arrays.sort(str,new Comparator<String>(){

			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				return (b+a).compareTo(a+b);
			}
			
		});
		
		for(int i=0;i<str.length;i++){
			System.out.print(str[i]);
		}
		
	}
	
	


	
}
