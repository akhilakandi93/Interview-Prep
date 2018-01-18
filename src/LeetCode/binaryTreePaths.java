package LeetCode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class binaryTreePaths {
	static class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		TreeNode(int x){
			val=x;
		}
	}
	public static void main(String[] args) {
		TreeNode a=new TreeNode(2);
		a.left=new TreeNode(3);
		a.left.left=new TreeNode(5);
		a.left.right=new TreeNode(1);
		a.right=new TreeNode(4);
		a.right.left=new TreeNode(1);
		System.out.println(binaryTree(a));
		char[] c={'a','b','c'};
		String s=Arrays.toString(c);
		s=s.replaceAll("\\]|\\[|,|\\s+", "");
		System.out.println(s);
		StringBuilder sb=new StringBuilder();
		sb.append("akhila");
		
		String str=sb.toString();
		str=str.substring(1);
		System.out.println(str);
		sb=new StringBuilder(str);
		boolean[] u=new boolean[3];
		System.out.println(u[0]);
	}
	   static int sum=0;
	public static int binaryTree(TreeNode root){
	    List<String> l=new ArrayList<String>();
	    StringBuilder sb=new StringBuilder();
	    getSumOfAllPaths(root,sb);
	    return sum;
	}

	public static void getSumOfAllPaths(TreeNode root,StringBuilder sb){
	    if(root!=null){
	        sb.append(root.val);
	        if(root.right==null && root.left==null){
	           sum=sum+Integer.parseInt(sb.toString());
	        }else{
	           if(root.left!=null){
	        	   	getSumOfAllPaths(root.left,sb);
	        	   	sb.setLength(sb.length()-1);
	           }
	           if(root.right!=null){
	            	getSumOfAllPaths(root.right,sb);
	            	sb.setLength(sb.length()-1);
	           }
	        }
	    }
	    
	}

}
