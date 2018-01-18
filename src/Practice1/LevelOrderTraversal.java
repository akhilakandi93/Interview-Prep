package Practice1;


import java.util.*;

public class LevelOrderTraversal {

	static class TreeNode{
		int val;
		TreeNode left,right;
		TreeNode(int x){
			val=x;
			left=null;
			right=null;
		}
	}
	public static void main(String[] args) {
		 TreeNode root = new TreeNode(1);
	       root.left= new TreeNode(1);
	       root.right= new TreeNode(2);
	       root.left.left= new TreeNode(4);
	       root.right.right= new TreeNode(5);
	       root.left.left.right=new TreeNode(6);
	       root.left.left.right.left=new TreeNode(6);
	       
	      int[] array=printLevelOrder(root);
	      for(int i=0;i<array.length;i++){
	    	  System.out.println(array[i]);
	      }
	       System.out.println(array);
	}
	
	public static int[] printLevelOrder(TreeNode root){
		 Queue q=new LinkedList<>();
				List<Integer> l=new ArrayList<Integer>();
				
				if(root!=null){
					q.add(root);
				}else{
					return new int[0];
				}
				while(!q.isEmpty()){
					int max=Integer.MIN_VALUE;
					int size=q.size();
					for(int i=0;i<size;i++){
						TreeNode node=(TreeNode) q.poll();
						max=Math.max(node.val, max);
						if(node.left!=null){
							q.add(node.left);
						}
						if(node.right!=null){
							q.add(node.right);
						}
					}
					l.add(max);
					
				}
				int[] array=new int[l.size()];
				for(int i=0;i<array.length;i++){
					array[i]=l.get(i);
				}
				return array;
	    }
		
	}


