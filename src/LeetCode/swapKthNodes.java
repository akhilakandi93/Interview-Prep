package LeetCode;


class ListNode{
	ListNode next=null;
	int val;
	public ListNode(int x){
		val=x;
	}
}
public class swapKthNodes {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a=new ListNode(1);
		//a.next=new ListNode(2);
//		a.next.next=new ListNode(3);
//		a.next.next.next=new ListNode(4);
//		a.next.next.next.next=new ListNode(5);
//		a.next.next.next.next.next=new ListNode(6);
		printList(a);
		a=swapNodes(a,1);
		printList(a);
	}
		
//	public static ListNode swap(ListNode a,int k ){
//		if(a.next==null){
//			return a;
//		}
//		if(a.next.next==null){
//			ListNode p2 = a.next;
//			a.next=null;
//			p2.next = a;
//			printList(p2);
//			return p2;
//		}
//		ListNode head=a;
//		ListNode prev=null;
//		ListNode front=a;
//		ListNode prev1=a;
//		int i=k;
//		while(i>1){
//			prev=head;
//			head=head.next;
//			i--;
//		}
//		front=head;
//		while(front.next!=null){
//			prev1=front;
//			front=front.next;
//		}
//	
//		System.out.println(head.val+" "+prev1.val+" "+front.val);
//		ListNode x=head.next;
//		ListNode y=front.next;
//		System.out.println(x.val);
//		if(prev==null){
//			prev=front;
//			front.next=null;
//			prev1.next=null;
//			head.next=null;
//			prev1.next=head;
//			head.next=null;
//			//head.next=
//			System.out.println(prev.val+" "+head.val+" "+prev1.val);
//			prev.next=x;
//			prev1.next=head;
//			head.next=null;
//			printList(prev);
//		}else{
//			prev.next=null;
//			ListNode temp=front.next;
//			prev.next=front;
//			front.next=null;
//			front.next=head.next;
//			prev1.next=null;
//			prev1.next=head;
//			head.next=temp;
//			printList(prev);
//			a=prev;
//			}
//		return a;
//	}
//
//	
	public static void printList(ListNode node){
		while(node!=null){
			System.out.print(node.val+"->");
			node=node.next;
		}
		System.out.print("null");
		System.out.println();
	}

	private static ListNode swapNodes(ListNode a, int i) {
		int length = lenght(a);
		if(a.next==null){
			return a;
		}
		if(a.next.next==null){
			ListNode p2 = a.next;
			a.next=null;
			p2.next = a;
			//printList(p2);
			return p2;
		}
		ListNode kthFromBegin = a; ListNode kthFromEnd = a; ListNode p3 = a; 
		   ListNode prev1=null; ListNode prev2 = null;
		   int c1 = 1;
		   while(c1!=i){
			   prev1 = kthFromBegin;
			   kthFromBegin=kthFromBegin.next;
			   c1++;
		   }
		   p3 = kthFromBegin;
		   while(p3.next!=null){
			   p3 = p3.next;
			   prev2 = kthFromEnd;
			   kthFromEnd = kthFromEnd.next;
		   }
		   
		   if(prev1!=null)
			   prev1.next = kthFromEnd;
		   if(prev2!=null)
			   prev2.next = kthFromBegin;
		
		   ListNode temp = kthFromBegin.next;
		   kthFromBegin.next = kthFromEnd.next;
		   kthFromEnd.next = temp;
		   
		   if(i==1)
			   a = kthFromEnd;
		   if(i==length)
			   a = kthFromBegin;
		return a;	   
	}
	
	private static int lenght(ListNode head){
		int count = 0;
		ListNode m1 = head;
		while(m1!=null){
			count++;
			m1 = m1.next;
		}
		return count;
	}
	/*
	 * 
	 * 
	 * 
	 * 
	 * // TODO Auto-generated method stub
		ListNode head=a;
		ListNode l=a;
		ListNode tmp=a;
		ListNode root=a;
		int k=i;
		ListNode prev=null;
		while(k>1){
			prev=head;
			head=head.next;
			k--;
		}
		
		tmp=head;
		ListNode prev1=null;
		while(tmp.next!=null){
			tmp=tmp.next;
			prev1=root;
			root=root.next;
		}
		printList(a);
		
		System.out.println(prev1.val+" "+head.val+" "+root.val+" "+head.next.val);

		if(head.next==root){
			prev=root;
			head.next=null;
			prev.next=head;
			printList(prev);
		}
		if(prev==null){
			prev=root;
			root.next=null;
			ListNode t=head.next;
			head.next=null;
			root.next=t;
			prev1.next=null;
			prev1.next=head;
			a=prev;
			printList(prev);
		}else{
		prev.next=null;
		ListNode temp=root.next;
		prev.next=root;
		root.next=null;
		root.next=head.next;
		prev1.next=null;
		prev1.next=head;
		head.next=temp;
		
		}
		

	 */

}
