package Practice1;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Set;

public class checking  {
	
	
	public int run(int a){
		return (int) Math.floor(a);
	}
	
	public int run(int a,int b,int c){
		return a+b+c;
	}
	public static void main(String[] args) {
		
	String st="bbabafgdsgdgdaa";
	System.out.println(st.indexOf("aa"));
		// TODO Auto-generated method stub
			Integer a=10;
			Integer b=new Integer(10);
			Integer c=new Integer(10);
			
			String str=new String("Akhila");
			str.concat("kandi");
			System.out.println(str);
			
			String s="Aki";
			s.concat("kan");
			System.out.println(s);
			//System.out.println(run(10.6,5.7));
			
			
			if(a==b){
				System.out.println("equal");
			}else{
				System.out.println("equal");
			}
			if(b.equals(c)){
				System.out.println("equal");
			}
			if(b==c){
				System.out.println("sdfequal");
			}
	}

}

