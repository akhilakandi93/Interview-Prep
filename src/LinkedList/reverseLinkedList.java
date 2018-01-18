package LinkedList;

import java.math.BigInteger;
import java.util.*;

//import ListNode;
class Node{
	int val;
	Node next;
	Node(int x){
		val=x;
	}
}
public class reverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger b=new BigInteger("1213213234234234242324");
		BigInteger l=new BigInteger("1231311311213");
		System.out.println(b.add(l));
		System.out.println(b.getClass());
	//	System.out.println(b.getLowestSetBit());
		System.out.println(b.getClass().getName());
		
		Hashtable<Integer,Integer> t=new Hashtable<Integer,Integer>();
		//t.put(1, null);
		int o=1;
		String p=String.valueOf(o);
		System.out.println(p);
//		t.put(null, 0);
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		hmap.put(1,2);
		hmap.put(2, 1);
		hmap.put(null,0);
		hmap.put(null, 1);
		hmap.put(3, null);
		Iterator it=hmap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair=(Map.Entry)it.next();
			System.out.println(pair.getKey());
		}
			Node a=new Node(1);
			a.next=new Node(2);
			a.next.next=new Node(3);
			a.next.next.next=new Node(4);
			a.next.next.next.next=new Node(5);
			printList(a);
			reverseList(a);
			reverseBetween(a,2,3);
	}

	
	
	public static Node reverseBetween(Node head, int m, int n) {
	   Node	prev=null;
	   Node start=head;
	   Node end=head;
	   int i=m,j=n;
	   while(i-1>1){
		   i--;
		   prev=start;
		   start=start.next;
	   }
	   Node p=null;
	   while(j>=0){
		   j--;
		   p=end; 
		   end=end.next;
	   }	  
	   p.next=null;
	   if(prev!=null) prev.next=null;
	   reverseList(start);
	   if(prev!=null){
		   prev.next=start;
	   }else{
		   head=start;
		  // prev=start;
	   }
	   while(start.next!=null){
		   start=start.next;
	   }
	   start.next=end;return head;
    }
	
	
	private static void reverseList(Node a) {
		Node nextNode=a.next;
		Node prev=a;
		Node head=a;
		a.next=null;
		while(nextNode!=null){
			a=nextNode.next;
			nextNode.next=head;
			head=nextNode;
			nextNode=a;
		}
		printList(head);
	}
	
	public static void printList(Node node){
		while(node!=null){
			System.out.print(node.val+"->");
			node=node.next;
		}
		System.out.print("null");
		System.out.println();
	}

}
