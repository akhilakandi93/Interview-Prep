package LinkedList;

public class partitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a=new ListNode(5);
		a.next=new ListNode(4);
		a.next.next=new ListNode(3);
		a.next.next.next=new ListNode(21);
		a.next.next.next.next=new ListNode(10);
		
		removeDupsFrmLinkedList rmv=new removeDupsFrmLinkedList();
		rmv.printList(a);
		a=partition(a,5);
		rmv.printList(a);
	}
	
	public static ListNode partition(ListNode node,int n){
		ListNode head=node;
		ListNode tmp=node;
		ListNode prev=node;
		int i=0;
		removeDupsFrmLinkedList rmv=new removeDupsFrmLinkedList();
		while(tmp!=null){
			if(tmp.val<n){
				ListNode h=tmp;
				prev.next=tmp.next;
				tmp.next=null;
				h.next=head;
				head=h;
				tmp=prev.next;
			}else{
				tmp=tmp.next;
				i++;
				if(i>1){
					prev=prev.next;
				}
			}
			node=head;
			rmv.printList(head);
		}
		return node;
	}

}
