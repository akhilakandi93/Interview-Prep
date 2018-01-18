package Practice1;

public class CheckIfOneStringIsAPermutationOfAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="akhila";
		String s="lakhia";
		if(str.length()!=s.length()){
			System.out.println("false");
		}
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.indexOf("a"));
		for(int i=0;i<str.length();i++){
			if(sb.toString().indexOf(s.charAt(i))>=0){
				sb.deleteCharAt(sb.toString().indexOf(s.charAt(i)));
			}else{
				System.out.println("Not same");
				System.exit(0);
			}
		}
		System.out.println("Same");
	}

}
