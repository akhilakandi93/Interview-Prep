package Practice1;



 class encapsulation{
	public int id;
	public String name;
	private int num;
	 int njd;
	encapsulation(int i,String n,int num){
		id=i;
		name=n;
		this.num=num;
	}
	
	public  int getID(){
		return njd;
	}
	
	protected String getName(){
		return name;
	}
	protected int getN(){
		return num;
	}
}
public class tryingOopsConcepts {

	// TODO Auto-generated constructor stub
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsulation e=new encapsulation(1,"Akhila",2);
		System.out.println(e.getID());
		e.getName();
		e.getN();
	}

}
