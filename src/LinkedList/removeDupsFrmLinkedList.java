package LinkedList;

 class ListNode{
	ListNode next=null;
	int val;
	public ListNode(int x){
		val=x;
	}
}
public class removeDupsFrmLinkedList {

	
	
	public static void main(String[] args) {
		ListNode a=new ListNode(4);
		ListNode b=new ListNode(4);
		ListNode c=new ListNode(4);
		ListNode d=new ListNode(4);
		ListNode e=new ListNode(4);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		printList(a);
		removeDups(a);
		printList(a);
	}
	
	public static void removeDups(ListNode n){
		ListNode x=n;
		while(x!=null){
			ListNode y=x;
			while(y.next!=null){
				//System.out.println(y.val);
				if(x.val==y.next.val){
					y.next=y.next.next;
				}else{
					y=y.next;
				}
			}
			x=x.next;
		}
	}
	
	public static void printList(ListNode node){
		while(node!=null){
			System.out.print(node.val+"->");
			node=node.next;
		}
		System.out.print("null");
		System.out.println();
	}

}
