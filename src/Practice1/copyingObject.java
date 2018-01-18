package Practice1;



/*
 * 
 * 3 ways to copy one object into another
 * 1- by constructor
 * 2- by copying individual value 
 * 3- by cloning
 */


class stack1{
	public  void run(){
		System.out.println("Hello");
	}
}

public class copyingObject extends stack1{

	public void run(){
		System.out.println("hey");
		//return 0;
	}
	static int a=10;
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		helloWorld hello=new helloWorld("Akhila",3095328);
		System.out.println(a);
		hello.display();
		//by constructor
		
		helloWorld hey=new helloWorld(hello);
		helloWorld blah=hey;
		hello.display();
		hey.display();
		blah.display();
		
		
		//by copying individual value
		
		helloWorld hola=new helloWorld();
		hola.name=hey.name;
		hola.display();
		
		
		//by cloning
		try{
		helloWorld bonjour=(helloWorld)hey.clone();
		bonjour.display();
		}catch(CloneNotSupportedException c	){
			
		}
	}

}
