package LinkedList;

public class deleteMiddleNode {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a=new ListNode(1);
		a.next=new ListNode(2);
		a.next.next=new ListNode(3);
		a.next.next.next=new ListNode(4);
		a.next.next.next.next=new ListNode(5);
		removeDupsFrmLinkedList rmv=new removeDupsFrmLinkedList();
		rmv.printList(a);
		removeMidNode(a.next);
		rmv.printList(a);
	}
	
	public static void removeMidNode(ListNode root) {
		// TODO Auto-generated method stub
	//	ListNode root=head;
		
		while(root.next.next!=null){
			System.out.println("test");
			root.val=root.next.val;
			root=root.next;
			
		}
		root.val=root.next.val;
		root.next=null;
		//return head;
	}
	
}																	                                       