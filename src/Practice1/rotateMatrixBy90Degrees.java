package Practice1;

public class rotateMatrixBy90Degrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="waterbottle";
		String d="erbottlewat";
		
		if(s.length()==d.length()){
			int i=1;
		   	while(i<d.length() && s.contains(d.substring(0, i))){
				i++;
			}
			if(s.contains(d.substring(0,i-1)) && s.contains(d.substring(i-1,d.length()))){
				System.out.println(d.substring(0,i-1));
				System.out.println(d.substring(i-1,d.length()));
			}
		}else{
			System.out.println("false");
		}
	}

}
