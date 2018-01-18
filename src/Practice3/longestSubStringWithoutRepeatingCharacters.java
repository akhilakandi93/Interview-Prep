package Practice3;

public class longestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String str="pwwkeeopiu";
		int max=0;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(sb.indexOf(Character.toString(ch))!=-1){
				if(sb.length()>max){
					max=sb.length();
					String s=sb.toString();
					int j=sb.indexOf(Character.toString(ch));
					s=s.substring(j+1);
					sb=new StringBuilder(s);
					sb.append(ch);
				}
			}else{
				sb.append(ch);
			}
			System.out.println(sb);
		}
		max=Math.max(max, sb.length());
		System.out.println(max);
	}

}
