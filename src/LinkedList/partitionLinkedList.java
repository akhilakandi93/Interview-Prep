package LinkedList;

import java.util.HashMap;

public class partitionLinkedList {

	public static void main(String[] args) {
		ListNode a=new ListNode(5);
		a.next=new ListNode(4);
		a.next.next=new ListNode(3);
		a.next.next.next=new ListNode(21);
		a.next.next.next.next=new ListNode(10);
		ListNode b=new ListNode(5);
		b.next=new ListNode(4);
		b.next.next=new ListNode(3);
		b.next.next.next=new ListNode(21);
		b.next.next.next.next=new ListNode(2);
		removeDupsFrmLinkedList rmv=new removeDupsFrmLinkedList();
		System.out.println(partition(a, b));
	}

	public static boolean partition(ListNode a,ListNode b){
		HashMap<ListNode, Integer> hmap=new HashMap<ListNode, Integer>();
		while(a!=null && b!=null){
			if(hmap.containsKey(a) || hmap.containsKey(b)){
				return false;
			}
			hmap.put(a, 1);
			hmap.put(b, 1);
			a=a.next;
			b=b.next;
		}
		return true;
	}
}
