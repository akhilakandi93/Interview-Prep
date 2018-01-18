package Practice2;
import java.util.*;

 class findUniqueInArray {
    public void foo(){
    	
    }
	public static void main(String[] args) {
		String str="123";
		if(0.0==(double)0)
		System.out.println("gfg");
		char ch='1';
		int k=Integer.parseInt(String.valueOf(ch));
		int[] nums={1, 8, 2, 5, 2, 1, 6, 9, 7, 8};
		System.out.println(getIndex(nums));
		String word="12sdf,sdf4,sadf,45fd,343";
		getWords(word);
		System.out.println(letters+" "+numbers);
	}
	static String letters="";
	static String numbers="";
	private static void getWords(String word) {
		String[] words=word.split(",");
		for(int i=0;i<words.length;i++){
			char ch=words[i].charAt(0);
			if((int)ch>=48 && (int)ch<=57 && numbers.equals("")){
				int k=check(words[i],48,57,1);
				if(k==0) numbers=words[i];
			}else if((int)ch>=97 && (int)ch<=122 && letters.equals("")){
				int k=check(words[i],97,122,1);
				if(k==0) letters=words[i];
			}
		}
	}

	public static int check(String word, int i, int j,int start) {
		if(start<word.length()){
			if((int)word.charAt(start)>=i && (int)word.charAt(start)<=j){
				return check(word,i,j,start+1);
			}else{
				return -1;
			}
		}else{
			return 0;
		}
		
	}

	private static int getIndex(int[] nums) {
		int index=0,min=Integer.MAX_VALUE;
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(hmap.containsKey(nums[i])){
				hmap.put(nums[i], nums.length);
			}else{
				hmap.put(nums[i], i);
			}
		}
		
		for(Integer key: hmap.keySet()){
			if(hmap.get(key)!=nums.length){
				if(min>key){
					min=key;
					index=hmap.get(key);
				}
			}
		}
		return index;
	}

}
 
 
