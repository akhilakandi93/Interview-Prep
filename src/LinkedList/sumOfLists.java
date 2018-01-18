package LinkedList;

public class sumOfLists {

	public static void main(String[] args) {
		ListNode a=new ListNode(5);
		a.next=new ListNode(4);
		a.next.next=new ListNode(3);
		ListNode b=new ListNode(1);
		b.next=new ListNode(9);
		b.next.next=new ListNode(8);

		removeDupsFrmLinkedList rmv=new removeDupsFrmLinkedList();
		
		ListNode c=sumOfLists(a,b);
		rmv.printList(c);
	}
	
	public static ListNode sumOfLists(ListNode a,ListNode b){
		ListNode c=new ListNode((a.val+b.val)%10);
		ListNode head=c;
		int extra=(a.val+b.val)/10;
		a=a.next;
		b=b.next;
		while(a!=null || b!=null || extra!=0){
			ListNode tmp=new ListNode(0);
			if(a!=null){
				tmp.val=a.val;
				a=a.next;
			}
			if(b!=null){
				tmp.val=tmp.val+b.val;
				b=b.next;
			}
			tmp.val=extra+tmp.val;
			if(tmp.val>9){
				extra=tmp.val/10;
				tmp.val=tmp.val%10;
			}else{
				extra=0;
			}
			c.next=tmp;
			c=tmp;
		}
		
		return head;
		
		
	}

}
