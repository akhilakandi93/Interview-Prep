package Practice1;
import java.util.*;
public class arrayList {

	interface op{
		public void run();
	}
	static class po implements op{
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("RUNN");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<Integer>();
		ArrayList<Integer> ll=new ArrayList<Integer>();
		op obj=new po();
		ll.add(2);
		ll.add(0);
		ll.add(1);
		System.out.println(ll);
		Collections.reverse(ll);
		Collections.sort(ll, Collections.reverseOrder());
		System.out.println(ll);
	}

}
