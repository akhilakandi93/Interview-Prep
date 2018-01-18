package Practice1;
import java.util.Date;
import java.util.HashMap;
import java.util.*;
import java.util.Calendar;

public class dateCalendar {
static final int a=10;

public String getHint(String secret, String guess) {
    String res="";
    int bulls=0;
    int cows=0;
    int len=guess.length();
    HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
    for(int i=0;i<len;i++){
        char ch=guess.charAt(i);
        if(hmap.containsKey(ch)){
            hmap.put(ch,hmap.get(ch)+1);
        }else{
            hmap.put(ch,1);
        }
    }
    
    for(int i=0;i<len;i++){
    	char a = secret.charAt(i);
    	char b = guess.charAt(i);
        if(a==b){
            bulls++;
            hmap.put(b,hmap.get(b)-1);
        }else if(hmap.containsKey(a) && hmap.get(a)>0 ){
            cows++;
            hmap.put(a,hmap.get(a)-1);
        }
    }
    return bulls+"A"+cows+"B";
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		String s=new String();
		Calendar c=Calendar.getInstance();
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(1);l1.add(2);l1.add(3);l1.add(4);
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(1);l2.add(2);l2.add(5);
		l1.retainAll(l2);
		System.out.println('9'-'0');
		//System.out.println(a);
//		System.out.println(c.getTimeInMillis());
//		System.out.println(d.compareTo(null));
		System.out.println('a'=='a');
		
	}

	public int findLengthOfLCIS(int[] nums) {
        int n=1,max=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                n++;
            }else{
                if(n>max){
                    max=n;
                }
                n=1;
            }
        }
        return nums.length==0 ? 0:Math.max(max,n);
    }
}
