package Practice1;

public class test {
	Thread t=new myThread();
	
}

class myThread extends Thread{
	int[] array={1,2,3,4,5};
	public void run(){
		for(int i=0;i<array.length;i++){
			array[i]=array[i]*10;
		}
	}
}