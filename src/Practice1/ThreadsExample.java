package Practice1;

class threadexample extends Thread{
	int i;
	char c;
	String[] words={" Akhila"," Kandi"," is"," very"," good"," girl"," and"};
	public void run(){
		i=0;
		while(i<words.length){
			System.out.print(words[i]);
			i++;
		}
	}

}

class runnableexample implements Runnable{
	int i;
	char c;
	String[] words={" Abhi"," Kandi"," is"," very"," bad"," boy"};
	public void run(){
		i=0;
		while(i<words.length){
			System.out.print(words[i]);
			i++;
		}
	}
}

public class ThreadsExample {

	public static void main(String[] args) {
		//creating a threadexample object
		threadexample t=new threadexample();
		
		//creating a runnableexample object
		runnableexample r=new runnableexample();
		
		//creating a thread object
		Thread th=new Thread(r);
		
		//setting maximum priority to threadexample object
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		th.start();
		
	}

}
