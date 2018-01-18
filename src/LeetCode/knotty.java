package LeetCode;

public class knotty {

	public static void main(String[] args) {
		String str="";
		
		System.out.println(getKnotty(str));

	}

	private static int getKnotty(String str) {
		int max=0;
		int count=1;
		int i=0;
		while(i<str.length()-1 && (int)str.charAt(i)<=(int)str.charAt(i+1)){
			count++;
			i++;
		}
		return str.length()==0 ? 0:count;
		
		
		
//		for(int i=0;i<str.length()-1;i++){
//			int ch=(int)str.charAt(i);
//			int a=(int)str.charAt(i+1);
//			if(a>=ch){
//				count++;
//			}else{
//				count=0;
//			}
//			max=Math.max(count, max);
//		}
		
		//return max+1;
	}

}
