package Practice1;

import java.util.*;

public class checkingInfiniteLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1={1,2,2,1};
		int[] nums2={2,2};
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		System.out.println(hmap);
		getMap(hmap);
		System.out.println(hmap);
	}

	private static void getMap(HashMap<Integer, Integer> hmap) {
		// TODO Auto-generated method stub
		int[] nums={1,12,3,4,5,6};
		int i=0;
		while(i<nums.length){
			hmap.put(nums[i], 1);
			i++;
		}
	}
	
	 public int[] intersect(int[] nums1, int[] nums2) {
	        int len=Math.min(nums1.length,nums2.length);
	        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
	        int[] array=new int[len];
	        for(int i=0;i<nums1.length;i++){
	            if(hmap.containsKey(nums1[i])){
	                hmap.put(nums1[i],hmap.get(nums1[i]));
	            }else{
	                hmap.put(nums1[i],1);
	            }
	        }
	        int j=0;
	        for(int i=0;i<nums2.length;i++){
	            if(hmap.containsKey(nums2[i]) && hmap.get(nums2[i])>0){
	                array[j]=nums2[i];
	                j++;
	                hmap.put(nums2[i],hmap.get(nums2[i])-1);
	            }
	        }
	        return Arrays.copyOfRange(array, 0, j);
	        
	    }
	

}
