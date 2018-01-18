package LinkedList;

public class removeKthElementFromLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a=new ListNode(1);
		a.next=new ListNode(2);
		a.next.next=new ListNode(3);
		a.next.next.next=new ListNode(4);
		a.next.next.next.next=new ListNode(5);
		removeDupsFrmLinkedList rmv=new removeDupsFrmLinkedList();
		rmv.printList(a);
		removeNthFromEnd(a,4);
		rmv.printList(a);
	}

	 public static ListNode removeNthFromEnd(ListNode head, int n) {
	        if(head.next==null && n==1){
	            return null;
	        }
	        ListNode node=head;
	        ListNode n2=head;
	        int count=0;
	        while(n2.next!=null && count!=n){
	            n2=n2.next;
	            count++;
	        }
	        if(n2.next==null && count!=n){
	            System.out.println("test");
	            head=head.next;
	            return head;
	        }
	        while(n2.next!=null){
	            n2=n2.next;
	            node=node.next;
	        }
	        node.next=node.next.next;
	        return head;
	    }
}
