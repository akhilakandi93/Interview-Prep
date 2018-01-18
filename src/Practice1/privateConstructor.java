package Practice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class privateConstructor {

//	 public static int minDistance(String word1, String word2) {
//	        if(word1.length()==0 || word2.length()==0) return Math.max(word1.length(),word2.length());
//	        
//	        int max=0;
//	        for(int i=0;i<word2.length();i++){
//	            int tmp=exploreCommon(word1,word2,i);
//	            max=Math.max(max,tmp);
//	            System.out.println(tmp);
//		        
//	        }
//	        int dist=word2.length()-max + word1.length()-max;
//	        return dist;
//	    }
//	    
//	    public static int exploreCommon(String word1, String word2, int index){
//	    	 int i=index;
//	         int start=0;
//	         int tmp=0;
//	         while(start<word1.length() && i<word2.length()){
//	             char ch=word2.charAt(i);
//	             if(word1.substring(start).indexOf(ch)!=-1){
//	                 int k=word1.substring(start).indexOf(ch)+1+word1.substring(0, start).length();
//	                 System.out.println(word2.charAt(index)+" "+k);
//	                 start=k;
//	                 tmp++;
//	             }
//	             i++;
//	         }
//	         return tmp;
//	    }
//	
	    static char[] alpha={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	    static StringBuilder sb=new StringBuilder();
	    
	    public static String convertToTitle(int n) {
	        if(n<=26){
	            sb.insert(0,alpha[n-1]);
	        }else{
	            int i=n;
	            while(i>26){
	                i=i-26;
	            }
	            sb.insert(0,alpha[i-1]);
	            i=(int) Math.floor(n/26);
	            
	            convertToTitle(i);
	        }
	        return sb.toString();
	    }
//	    public static int countNumbersWithUniqueDigits(int n) {
//	        if(n==0) return 0;
//	        if(n==1) return 9;
//	        int k= (int)Math.pow(10,n);
//	        List<Integer> l=new ArrayList<Integer>();
//	        int i=0;
//	        l.add(9);
//	        while(n-2>=0){
//	            int p=(int) (((i)*10+(i+1)*(9-i))*Math.pow(9,i));
//	            n--;
//	            i++;
//	            l.add(p);
//	        }
//	        System.out.println(l);
//	        long sum=0;
//	        
//	        for(int j=0;j<l.size();j++){
//	            sum=sum+l.get(j);
//	        }
//	        System.out.println(sum+" "+k);
//	        return  (int) (k-sum);
//	    }
	    
	    public static int[] findOrder(int numCourses, int[][] prerequisites) {
	        List<Integer> order=new ArrayList<Integer>();
	        HashMap<Integer, ArrayList<Integer>> hmap=new HashMap<Integer,ArrayList<Integer>>();
	        for(int i=0;i<prerequisites.length;i++){
	            if(hmap.containsKey(prerequisites[i][0])){
	                ArrayList<Integer> l=hmap.get(prerequisites[i][0]);
	                l.add(prerequisites[i][1]);
	                hmap.put(prerequisites[i][0],l);
	            }else{
	                ArrayList<Integer> l=new ArrayList<Integer>();
	                l.add(prerequisites[i][1]);
	                hmap.put(prerequisites[i][0],l);
	            }
	        }
	        if(numCourses==hmap.size()) return new int[0];
	        
	        for(int i=0;i<prerequisites.length;i++){
	            if(!hmap.containsKey(prerequisites[i][1]) && !order.contains(prerequisites[i][1])){
	                order.add(prerequisites[i][1]);
	            }
	        }
	        Iterator it=hmap.entrySet().iterator();
	        while(it.hasNext()){
	            Map.Entry pair=(Map.Entry)it.next();
	            getPrerequisites((int)pair.getKey(),order,hmap);
	        }
	        
	        int[] courseOrder=new int[order.size()];
	        System.out.println(order);
	        for(int i=0;i<order.size();i++){
	            courseOrder[i]=order.get(i);
	            System.out.print(courseOrder[i]+" ,");
	        }
	        
	        return courseOrder;
	        
	    }
	    
	    public static void getPrerequisites(int course,List<Integer> order,HashMap<Integer,ArrayList<Integer>> hmap){
	        if(!order.contains(course)){
	        List<Integer> l=hmap.get(course);
	        int i=0;
	            while(i<l.size()){
	                getPrerequisites(l.get(i),order,hmap);
	                if(!order.contains(l.get(i))) order.add(l.get(i));
	                i++;
	            }
	            if(!order.contains(course)) order.add(course);
	        }
	        
	    }
	public static void main(String[] args) {
		int[][] courses={{1,0},{2,1},{3,2},{1,3}};
		//findOrder(4,courses);
		
		
		//System.out.println(Math.floor((double)1/5));
	}
//	class abc{
//		public void game(int n){
//			privateConstructor pv=new privateConstructor();
//		}
//	}

}


