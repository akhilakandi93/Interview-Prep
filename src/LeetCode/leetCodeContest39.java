package LeetCode;

//class ListNode{
//	ListNode next;
//	int val;
//	ListNode(int x){
//		val=x;
//	}
//}

class TreeNode{
	TreeNode left;
	TreeNode right;
	int val;
	TreeNode(int x){
		val=x;
	}
}
public class leetCodeContest39 {

	public static void main(String[] args) {
		String str="2016:01:sfsdf";
		System.out.println(str.substring(5,8).indexOf("01"));
		//int s=Integer.parseInt(str.substring(0,4));
		String s="2016:01:01:01:01:01";
				String e="2017:01:01:23:00:00";
		    int y1=Integer.parseInt(s.substring(0,4));
	        int y2=Integer.parseInt(e.substring(0,4));
	        int m1=Integer.parseInt(s.substring(5,7));
	        int m2=Integer.parseInt(e.substring(5,7));
	        int d1=Integer.parseInt(s.substring(8,10));
	        int d2=Integer.parseInt(e.substring(8,10));
	        int h1=Integer.parseInt(s.substring(11,13));
	        int h2=Integer.parseInt(e.substring(11,13));
	        int s1=Integer.parseInt(s.substring(17,19));
	        System.out.println(y1);
	        System.out.println(y2);
	        System.out.println(m1);
	        System.out.println(m2);
	        System.out.println(d1);
	        System.out.println(d2);
	        System.out.println(h1);
	        System.out.println(h2);
	        System.out.println("sec"+s1);
		
		
		
		
		System.out.println(s);
		System.out.println(judgeSquareSum(10000000));
	}
	
	 public static boolean judgeSquareSum(int c) {
		 double sqrt = Math.sqrt(10);
		 int x = (int) sqrt;
		 System.out.println(x);
		 if(Math.pow(sqrt,2) == Math.pow(x,2)){
			 return true;
		 }
	        int i=1;
	        int j=x;
	        while(i<j){
	            int tmp=i*i+j*j;
	            if(tmp<c){
	                i++;
	            }else if(tmp>c){
	                j--;
	            }else if(tmp==c){
	                return true;
	            }
	        }
	        return false;
	    }

}
