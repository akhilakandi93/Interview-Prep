package Hackerrank;
import java.text.NumberFormat;
import java.util.*;
public class tapeRecorder {
	static HashMap<String,List<Integer>> hmap;
	static long calculateAmount(int[] prices) {
        long total_amt=prices[0];
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]) min=prices[i];
            else total_amt=total_amt + prices[i]-min;
        }
        return total_amt;
    }
	
	static long[] maxMin(String[] op, int[] x){
		long[] nums=new long[op.length];
		Queue<Integer> min=new LinkedList<Integer>();
		ArrayList<Integer> ll=new ArrayList<Integer>();
		int mini=Integer.MAX_VALUE,max=Integer.MIN_VALUE,j=0,k=0;
		for(int i=0;i<op.length;i++){
			if(op[i].equals("push")){
				min.add(x[k]);
				ll.add(x[k]);
				if(x[k]<mini) mini=x[i];
				if(x[k]>max) max=x[i];
				k++;
			}else{
				Collections.sort(ll);
				if(min.peek()==ll.get(0)){
					ll.remove((Integer)ll.get(0));
				}else if(min.peek()==ll.get(ll.size()-1)){
					ll.remove((Integer)ll.get(ll.size()-1));
				}
				mini=ll.get(0);
				max=ll.get(ll.size()-1);
			}
			int tmp=mini*max;
			nums[j]=tmp;
			j++;
			System.out.println(tmp);
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int[] prices={4,9,2,3};
		String[] op={"push","push","push","pop"};
		Double expense = 323.567; 
		NumberFormat currency = NumberFormat.getCurrencyInstance(); 
		String expenseString = currency.format(expense);
		System.out.println(Math.ceil(-51.6));
		int[] nums={1,2,3};
		String asd_ab="AK";
		double x=11;
		double y=4.4;
		double z=x/y;
		System.out.println(z);
		//maxMin(op,nums);
	System.out.println(calculateAmount(prices));
//		String[] songs={"meghan","taylor swift","rihanna","adele","justin","justin","selena","jennifer"};
//		hmap=new HashMap<String,List<Integer>>();
//		if(Character.isAlphabetic('A')){
//			System.out.println(true);
//		}else{
//			System.out.println(false);
//		}
//		for(int i=0;i<songs.length;i++){
//			List<Integer> l;
//			if(hmap.containsKey(songs[i])){
//				l=hmap.get(songs[i]);
//			}else{
//				l=new ArrayList<Integer>();
//			}
//			l.add(i+1);
//			hmap.put(songs[i], l);
//		}
//		String str="Akhila";
//		//System.out.println(str.substring(7).indexOf('a'));
//		System.out.println(hmap);
//		System.out.println(getSong(songs,6,"meghan"));
//		int k=5;
//		int size=String.valueOf(Integer.toBinaryString(k)).length();
//		StringBuilder sb=new StringBuilder();
//		for(int i=0;i<size;i++) sb.append('1');
//		size=Integer.parseInt(sb.toString(),2);
//		System.out.println(k^size);
//		String s="Akhia";
//		s.toLowerCase();
//		char ch='a';
//		System.out.println(Character.toLowerCase(ch));
//		System.out.println(s.toLowerCase());
	}

	private static int getSong(String[] songs, int index, String song) {
		int min=Integer.MAX_VALUE;
		List<Integer> l=hmap.get(song);
		index++;
		for(int i=0;i<l.size();i++){
			min=Math.min(min, Math.min(Math.abs(index-l.get(i)), songs.length-index+l.get(i)));
		}
		return min;
	}
	public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
        for(int i=0;i<licensePlate.length();i++){
            char ch=Character.toLowerCase(licensePlate.charAt(i));
            if((int)ch>=97 && (int)ch<=122){
                if(hmap.containsKey(ch)){
                    hmap.put(ch,hmap.get(ch)+1);
                }else{
                    hmap.put(ch,1);
                }
            }
        }
        
        int count=Integer.MAX_VALUE;
        String result="";
        for(int i=0;i<words.length;i++){
            if(words[i].length()<count){
            String temp=words[i].toLowerCase();
            Iterator it=hmap.entrySet().iterator();
            int tmp=0;
            while(it.hasNext()){
                Map.Entry pair=(Map.Entry)it.next();
                char ch=(Character)pair.getKey();
                int t=(int)pair.getValue(),j=0;
                while(t!=0){
                    if(temp.substring(j).indexOf(ch)==-1) break;
                    t--;
                    j=temp.substring(j).indexOf(ch);
                }
                tmp++;
            }
            if(tmp==hmap.size()) {
                result=temp;
            }
            }
        }
        return result;
    }
}
