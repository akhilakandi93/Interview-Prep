package Practice1;

public class helloWorld implements Cloneable{
	 String name;
	 int number;
	 static {
		 System.out.println("Holaa I am excuting without main method.");
		// System.exit(1);
	 }
	 
	 public static void main(String args[]){
		 System.out.println("main againn");
	 }
	 helloWorld(String n,int num){
		name=n;
		number=num;
	}
	
	 helloWorld(helloWorld h){
		name=h.name;
		number=h.number;
	}
	
	helloWorld(){
		run();
	}
	public final int run(){
		return number;
	}
	
	public String run1(){
		return name;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public void display(){
		System.out.println(name+" "+number);
	}
	
}
