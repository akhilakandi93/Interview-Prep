package LeetCode;
import java.math.BigInteger;
import java.util.*;


public class elementum {
	static class TreeNode {
		TreeNode left;
		TreeNode right;
		int val;
		TreeNode(int x){
			val=x;
		}
	}
	public static void print(int num){
	 String str=String.valueOf(num);
	 System.out.println(str);
	}
public static boolean isHappy(int n) {
        List<String> l=new ArrayList<>();
        Queue q=new LinkedList();
        q.add(2);
        Deque d=new ArrayDeque();
        
        l.add(String.valueOf(10)+String.valueOf(20));
        System.out.println(l);
        while(n<10){
            
        }
        return n==1? true:false;
    }
static int m=10;

public  void main(int a){
	int f=10;
	
	
}

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.right=new TreeNode(7);
		root.right.right.left=new TreeNode(8);
		BFS(root);
		long i=243423442;
		elementum ee=new elementum();
		ee.print(1);
		boolean[] t=new boolean[10];
		System.out.println(t[0]);
		print(103453545);
		m++;
		System.out.println(m);
		// TODO Auto-generated method stub
//		List<String> l=new ArrayList<>();
//        l.clear();
//        l.add(String.valueOf(10)+String.valueOf(20));
////        System.out.println(l);
////		System.out.println(l.contains("1020="));
//		l.add("Akhila");
//		l.add("Kandi");
//		System.out.println(l);
//		l.subList(1, l.size()).clear();;
//		System.out.println(l);
//		String s="Akhila	Kand	akds	asds";
//		//String[] t=s.s
//		//System.out.println(t[3]+" "+t[0]);
//		Queue<Integer> q=new LinkedList<Integer>();
////		List<Integer> l=new ArrayList<Integer>();
////		l.add(9);
////		System.out.println(l);
////		l.remove(Integer.valueOf(9));
////		System.out.println(l);
////		System.out.println("output");
////		System.err.println("Error output");
////		for(int i=0;i<10;i++){
////			System.out.println("output");
////			System.err.println("Error output");
////		}
//		double d=270.3;
//		System.out.println(Math.ceil(d));
//		
//		StringBuilder sb=new StringBuilder();
//        sb.append("1234");
//       sb.setLength(0);
//       long r=(long)270.33;
//       System.out.println(Long.MAX_VALUE+"  "+Double.POSITIVE_INFINITY);
//           int k=Integer.parseInt(Character.toString(sb.charAt(sb.length()-1)));
//        System.out.println(k);
//		
//		
//		
//			int[] a=new int[2];
//			System.out.println(a[2]);
//		//String s=null;
//		int i=(Integer) null;
//		System.out.println(i);
	}
private static void BFS(TreeNode root) {
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.offer(root);
		int count=0;
		while(!q.isEmpty()){
			int size=q.size();
			System.out.println("Level "+count);
			for(int i=0;i<size;i++){
				TreeNode tmp=q.peek();
				System.out.print(tmp.val+" ");
				if(tmp.left!=null) q.offer(tmp.left);
				if(tmp.right!=null) q.offer(tmp.right);
				q.poll();
			}
			System.out.println();
			count++;
		}
	}
public void add(int a){
	List<Integer> l=new ArrayList<Integer>();
	l.add(null);
	l.add(null);
	l.add(1);
	System.out.println(l);
	return;
}
	
	 public int findNthDigit(int n) {
	        if(n<10) return n;
	       List<Long> ll=new ArrayList<Long>();
	        long sum=0,i=0,j=1;
	        while(sum<n){
	            long tmp=(long) (9*(Math.pow(10,i))*j);
	            ll.add(tmp);
	            sum=sum+tmp;
	            i++;j++;
	        }
    System.out.println(ll);
   // sum=0;
    i=0;
    sum=sum-ll.get(ll.size()-1);
    StringBuilder s=new StringBuilder();
	        while(i<ll.size()-1){
	            i++;
             s.append(9);
	        } 
    int m=(int) (n-sum);
    System.out.println("m= "+m);
    double tmp=(double)m/(ll.size());
    System.out.println(tmp);
    int result=(int) (Integer.parseInt(s.toString())+Math.ceil(tmp));
    s.setLength(0);
    s.append(result);
         if(tmp-(int)tmp==0){
             System.out.println(tmp);
	            return Integer.parseInt(Character.toString(s.charAt(s.length()-1)));
	        }else{
	            int k=0;
	            while(tmp-(int)tmp!=0){
	                m++;
	                tmp=(double)m/(ll.size());
                 System.out.println(tmp+"  :  "+(int)tmp);
	                k++;
	            }  
             System.out.println("tmp= "+tmp+" k="+k);
	            return Integer.parseInt(Character.toString(s.charAt(s.length()-1-k)));
	        }
	    }
	
	
}

class blah extends elementum{
	static int a=10;
	public static void print(int n){
		System.out.println(a++);
	}
	
	
	
}
