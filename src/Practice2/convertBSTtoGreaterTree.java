package Practice2;
import java.util.*;
class TreeNode{
	TreeNode left;
	TreeNode right;
	int val;
	TreeNode(int x){
		val=x;
	}
}
public class convertBSTtoGreaterTree {

	public static void main(String[] args) {
		int n=5;
		System.out.println(Integer.bitCount(n));

	}

	public static void convert(TreeNode root) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		insert(root,l);
		Collections.sort(l);
		for(int i=l.size()-2;i>=0;i++){
			int k=l.get(i)+l.get(i+1);
			l.add(i, k);
		}
		convert(root,l);
	}
	
	public static void convert(TreeNode root, ArrayList<Integer> l){
		if(root!=null){
			changevalue(root,l,0,l.size()-1);
			convert(root.left,l);
			convert(root.right,l);
		}
	}
	

	private static void changevalue(TreeNode root, ArrayList<Integer> ll,int l,int r) {
		int mid=l+(r-l)/2;
		if(mid!=ll.size()){
			int k=ll.get(mid+1)-ll.get(mid);
			if(k==root.val){
				root.val=ll.get(mid);
			}else if(k<root.val){
				changevalue(root,ll,mid+1,r);
			}else{
				changevalue(root,ll,l,mid-1);
			}
		}else{
			return;
		}
		
	}

	private static void insert(TreeNode root, ArrayList<Integer> l) {
		if(root!=null){
			l.add(root.val);
			insert(root.left,l);
			insert(root.right,l);
		}
		
	}

}
