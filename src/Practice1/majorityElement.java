package Practice1;

import java.util.*;

public class majorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(2);
		l.add(3);
		l.remove(0);
		l.add(2, 2);
		System.out.println(l);
		int[] nums={1,2,3,4,5,6,7,5,3,9,9,9,9,9,9,9,9,9,9,};
		System.out.println(majorityElement(nums));
	}
	
	public static List<Integer> majorityElement(int[] nums) {
		List<Integer> l=new ArrayList<Integer>();
        int num1=nums[0],num2=nums[0],c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1){
                c1++;
            }else if(nums[i]==num2){
                c2++;
            }else if(c1==0){
                num1=nums[i];
                c1++;
            }else if(c2==0){
                num2=nums[i];
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1){
                c1++;
            }else if(nums[i]==num2){
                c2++;
            }
        }
        if(c1>nums.length/3){
            l.add(num1);
        }
        if(c2>nums.length/3){
            l.add(num2);
        }
        
        return l;
	}

}
