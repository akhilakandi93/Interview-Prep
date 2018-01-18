package LeetCode;

import java.util.*;

public class aToi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="    asd 1  2   3 78394 324442";
		str=str.replaceAll("\\s+", "");
//		try{
//			System.out.println(Long.parseLong(str));
//		}catch(NumberFormatException e){
//			System.out.println(0);
//		}
		int[] nums={-1, 0, 1, 2, -1, -4};
		System.out.println(Sum(nums));
	}
	
	
	public static List<List<Integer>> Sum(int[] nums){
		List<List<Integer>> ll=new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++){
			if(i==0 || nums[i]>nums[i-1]){
			int j=i+1;
			int k=nums.length-1;
			while(j<k){
				if(nums[i]+nums[j]+nums[k]==0){
					List<Integer> l=new ArrayList<Integer>();
					l.add(nums[i]);
					l.add(nums[j]);
					l.add(nums[k]);
					ll.add(l);
					j++;
					k--;
					while(j<k && nums[j]==nums[j-1]){
						j++;
					}
					while(j<k && nums[k]==nums[k+1]){
						k--;
					}
				}else if(nums[i]+nums[j]+nums[k]<0){
					j++;
				}else if(nums[i]+nums[j]+nums[k]>0){
					k--;
				}
			}
			}
		}
		System.out.println(ll.size());
		return ll;
	}

}
