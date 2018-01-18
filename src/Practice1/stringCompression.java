package Practice1;

public class stringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabcccccaaa";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			int p=1;
			while(i+1<s.length() && s.charAt(i+1)==c){
				p++;
				i++;
			}
			sb.append(c);
			sb.append(String.valueOf(p));
			
		}
		if(sb.length()<s.length()){
			System.out.println(sb);
		}else{
			System.out.println(s);
		}
		
	}
	
	

}
