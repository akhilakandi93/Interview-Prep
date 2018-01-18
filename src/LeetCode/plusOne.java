package LeetCode;

public class plusOne {

	public static void main(String[] args) {
		int [] digits={0};
		 StringBuilder sb=new StringBuilder();
			for(int i=0;i<digits.length;i++){
				sb.append(digits[i]);
			}
	        int carry=1, l=sb.length()-1;
	        while(carry!=0 || l>=0) {
	            int sum=Integer.parseInt(String.valueOf(sb.charAt(l)))+carry;
	            System.out.println("asd "+String.valueOf(sb.charAt(l)));
	            System.out.println(sum);
	            carry=0;
	            if(sum>9){
	            	carry=sum%10;
	            }
	            System.out.println("carry "+carry);
	            sum=sum/10;
	            sb.setCharAt(l,(char)sum);
	            l--;
	        }
			System.out.println("sdfs "+sb);
	        if(sb.length()==digits.length){
	            int j=sb.length()-1;
				for(int i=0;i<sb.length();i++){
	                digits[i]=Integer.parseInt(Character.toString(sb.charAt(j)));
	                j--;
	            }
	          //  return digits;
			}else{
			    int[] dig=new int[sb.length()];
	             int j=sb.length()-1;
	            for(int i=0;i<sb.length();i++){
	                dig[i]=Integer.parseInt(Character.toString(sb.charAt(j)));
	                j--;
	            }
	         //   return dig;
			}
	}

}
