package LinkedList;

public class removeDuplicatesFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ListNode a=new ListNode(1);
			a.next=new ListNode(1);
			a.next.next=new ListNode(3);
			a.next.next.next=new ListNode(3);
			a.next.next.next.next=new ListNode(4);
			a.next.next.next.next.next=new ListNode(5);
		
			removeDupsFrmLinkedList.printList(a);
			a=removeDuplicates(a);
			removeDupsFrmLinkedList.printList(a);
	}
	
	
	private static ListNode removeDuplicates(ListNode a) {
		// TODO Auto-generated method stub
		ListNode head=a;
		ListNode prev=null;
		int count=0;
		while((head!=null && head.next!=null) || count!=0){
			if(head.next!=null && head.val==head.next.val){
				ListNode tmp=head.next;
				head.next=head.next.next;
				tmp.next=null;
				count++;
				System.out.println("Here");
				removeDupsFrmLinkedList.printList(a);
			}else{
				if(count>0){
					ListNode tmp=head.next;
					head.next=null;
					head=tmp;
					if(a.next==null){
						a=head;
						prev=head;
					}else{
						prev.next=head;
					}
					count=0;
					//head=head.next;
				}else{
					
					   prev=head;
					   head=head.next;
					  
					//head=head.next;
				}
				System.out.println("From Here");
				removeDupsFrmLinkedList.printList(a);
			}
		}
		return a;
	}
	
	
	
}