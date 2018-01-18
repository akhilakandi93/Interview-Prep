package LeetCode;

import java.util.*;
import java.util.HashMap;

class Student{
	int age;
	String name;
	Student (int a,String n){
		name=n;
		age=a;
	}
}
public class test {

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
//        int[] nums = new int[] {67,80};
//        for(int i=0;i<nums.length;i++){
//            
//            System.out.println(specialMultiple(nums[i]));
//        }
    	List<List<String>> ll=new ArrayList<List<String>>();
    	List<String> l=new ArrayList<String>();
    	l.add("eat");
    	l.add("ate");
    	ll.add(l);
    	System.out.println(ll);
    	ll.remove(0);
    	System.out.println(ll);
    	String[] s={"eat", "tea", "tan", "ate", "nat", "bat"};
    	String[] st=s;
    	for(int i=0;i<s.length;i++){
    		char[] ch=s[0].toCharArray();
    		Arrays.sort(ch);
    		String str=	String.valueOf(ch);
    		s[i]=str;
    	}
    	
    	StringBuilder sb=new StringBuilder();
    	sb.append("2579");
    	System.out.println(sb.indexOf("8"));
    	//sb.substring(start);
    	int[] y={1,8,9,0,0};
    	
    	
    	
     
    }
    
    
    
   
    
    public static int  specialMultiple(int num){
        int i = 0;
        long res = 0;
        boolean loopBrk = true;
        int ct = 0;
        while(loopBrk){
            long sum = 0;
            int j = i;
            while(j >= 0){
            	//System.out.println(++ct);
                sum += 4*Math.pow(10,j);
                if(sum > Long.MAX_VALUE/100) return 0;
                
                if(sum%num ==0){
                    res = sum;
                    loopBrk = false;
                    break;
                }
                j--;
            }
            i++;
        }
        int a = 0, b = 0;
        String zv = Long.toString(res);
        for(int k = 0; k < zv.length(); k++){
            if(zv.charAt(k) == '4') a++;
            else if (zv.charAt(k) == '0') b++;
        }
        return (2*a+b);
    }





	






}
