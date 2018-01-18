package Practice1;

public class replacingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Akhila    is the     greatest of   all. She is just the bestt!";
		String[] array=s.split("\\s+");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<array.length;i++){
			sb.append(array[i]);
			if(i!=array.length-1){
				sb.append("%20");
			}
		}
		System.out.println(sb);
	}

}
