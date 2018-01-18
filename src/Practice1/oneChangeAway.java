package Practice1;


/*
 * Either insert remove or replace a character
 * and make two strings same by editing only once
 */
public class oneChangeAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="pale";
		String b="bake";
		if(a.length()==b.length()){
			
			if(!a.equals(b)){
				StringBuilder sb=new StringBuilder(a);
				int count=0;
				for (int i=0;i<a.length();i++){
					if(a.charAt(i)!=b.charAt(i) && count<1){
						char c=b.charAt(i);
						sb.setCharAt(i, c);
						count++;
					}
				}
				if(b.equals(sb.toString())){
					System.out.println("true");
				}else{
					System.out.println("Not True");
				}
			}
		}else if(Math.abs(a.length()-b.length())==1){
			StringBuilder sb;
			if(a.length()>b.length()){
				sb=new StringBuilder(a);
				a=b;
			}else{
				sb=new StringBuilder(b);
			}
			int count=0;
			for(int i=0;i<sb.length();i++){
					if(i==sb.length()-1){
						if(a.length()!=sb.length()){
							sb.deleteCharAt(i);
						}
					}else if(sb.charAt(i)!=a.charAt(i) && count<1){
					sb.deleteCharAt(i);
					count++;
				}
			}
			if(a.equals(sb.toString())){
				System.out.println("True");
			}else{
				System.out.println("Not True");
			}
			
		}
	}

}
