package Hackerrank;

import java.util.*;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class drawBridge2 {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hmap=new HashMap<>();
		hmap.put(null, 0);
		hmap.put(null, null);
		hmap.put(1, null);
		System.out.println(hmap);
		Hashtable<Integer,Integer> tab=new Hashtable<>();
		tab.put(1, 4);
		System.out.println(tab);
		HashSet set=new HashSet();
		set.add(null);
		set.add(1);
		set.add(null);
		set.add(1);
		System.out.println(set);
		ListNode l=new ListNode(2);
		System.out.println((int)(Math.random()*10+1));
	}
	
	public static Integer v(){
		return 0;
	}

}
