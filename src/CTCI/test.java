package CTCI;

import java.util.*;

public class test {
public  int p=9;

	public static void main(String[] args) {
		int a = 1;

		int b = a++;
//System.out.println("p= "+p);
		int c = ++b;
		System.out.println(a+" "+b+" "+c);
		System.out.println(sep+msg);
		String s="Akhila";
		int[] nums={0,0,0,0};
		boolean[] used = new boolean[nums.length];
		System.out.println(used[0]);
		change(nums);
		System.out.println(nums[2]);
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(0, 2);
			System.out.println(l);
	}
	private static void change(int[] nums) {
		nums[2]=20;
		
	}
	public int size=0;
    public int coinChange(int[] coins, int amt) {
        Arrays.sort(coins);
        int sum=0;
       // dfs(coins,amt,coins.length-1,0);
        int i=coins.length-1;
        while(i>=0 && sum!=amt){
            if(sum+coins[i]<=amt){
                sum=sum+coins[i];
                size++;
            }else {
                i--;
                if(sum>0){
                    sum=sum-coins[i];
                    size--;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        //sb.setLength(newLength);
        return size;
    }
	private static final char sep=0x20;
	private static final int msg=1;
	
	

}
