package Practice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class leetCodeContest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] t={'A','A','A','B','B','B'};
		
		System.out.println(leastInterval(t,2));
		System.out.println("Hogaya");
	}
	
	 public static int leastInterval(char[] tasks, int n) {
	        HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
	        Set<Character> s=new HashSet<Character>();
	        for(int i=0;i<tasks.length;i++){
	            if(hmap.containsKey(tasks[i])){
	                hmap.put(tasks[i], hmap.get(tasks[i])+1);
	            }else{
	            	hmap.put(tasks[i], 1);
	            }
	            s.add(tasks[i]);
	        }
	        System.out.println(hmap);
	        System.out.println(s);
	        int count=0,i=0;
	        while(s.size()>0){
	        	Iterator it=s.iterator();
	        	while(it.hasNext() && i<=n){
	        		if(hmap.get(it.next())>0){
	        			char c=(char) it.next();
	        			System.out.println(c);
	        			hmap.put(c, hmap.get(c)-1);
	        			count++;
	        			i++;
	        		}else{
	        			s.remove(it.next());
	        		}
	        	}
	        	count++;
	        		i=0;
	        }
	        return count;
	    }
	
	
	
	public int maxDistance(int[][] arrays) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int l=-1,k=-1;
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<arrays.length;i++){
        	a.add(arrays[i][0]);
        	int len=arrays[i].length-1;
        	a.add(arrays[i][len]);
        	if(arrays[i][0]<min){
        		min=arrays[i][0];
        	}
        	if(arrays[i][len]>max){
        		max=arrays[i][len];
        	}
        }
        int min1=min,x=0,y=0;
        int max1=max;
        for(int i=0;i<a.size();i++){
        	if(a.get(i)<=min){
        		min=a.get(i);
        		l=i;
        	}
        	
        	if(a.get(i)>=max){
        		max=a.get(i);
        		k=i;
        	}
        	if(min1>min && min1<a.get(i)){
        		min1=a.get(i);
        		x=i;
        	}
        	if(max1<max && max1>a.get(i)){
        		max1=a.get(i);
        		y=i;
        	}
        }
        if(l==k){
        	return Math.max(max-min1, max1-min);
        }else{
        	return max-min;
        }
   
    }
}
