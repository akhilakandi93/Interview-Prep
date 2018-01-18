package LeetCode;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class removeDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums={1,1,1};
		int len=removeDuplicates(nums);
		System.out.println(len);
		//remove(1);
	}

	private static  int removeDuplicates(int[] nums) {
		// TODO Auto-generated method stub
		if(nums.length<3){
	            return nums.length;
	        }
		int len=nums.length;
		int count=1;
		Map<Integer,Integer> hmap=new TreeMap<Integer,Integer>();
		for(int i=0;i<nums.length-1;i++){
			if(hmap.containsKey(nums[i])){
				hmap.put(nums[i], hmap.get(nums[i])+1);
			}else{
				hmap.put(nums[i], 1);	
			}
			if(nums[i]==nums[i+1]){
				count++;
			}else{
				if(count>2){
					len=len-count+2;
				}
				count=1;
			}
		}
		if(hmap.containsKey(nums[nums.length-1])){
			hmap.put(nums[nums.length-1], hmap.get(nums[nums.length-1])+1);
		}else{
			hmap.put(nums[nums.length-1], 1);
		}
		if(count>2){
			len=len-count+2;
		}
		Iterator mt=hmap.entrySet().iterator();
		while(mt.hasNext()){
			Map.Entry pair=(Map.Entry)mt.next();
			System.out.println(pair.getKey()+"->"+pair.getValue());
		}
		Iterator it=hmap.entrySet().iterator();
		int i=0;
		while(i<len && it.hasNext()){
			Map.Entry pair=(Map.Entry) it.next();
			int l=hmap.get(pair.getKey());
			int tmp=1;
			while(l>0 && tmp<3){
				nums[i]=(int) pair.getKey();
				i++;
				l--;
				tmp++;
			}
		}
		for(i=0;i<len;i++){
			System.out.print(nums[i]+" ");
		}
		
		
		return len;
	}
	

}
