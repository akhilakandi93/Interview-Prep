package LeetCode;

class PrintChar extends Thread{
	char ch;
	int i;
	public PrintChar(char c,int num){
		ch=c;
		i=num;
	}
	public void run(){
		for(int j=0;j<i;j++){
			System.out.print(ch);
		}
		
	}
}

class PrintNum extends Thread{
	int i;
	public PrintNum(int num){
		i=num;
	}
	public void run(){
		for(int j=0;j<i;j++){
			System.out.print(j);
		}
	}
}
public class InversePairs {

	public static void main(String[] args) {
		PrintChar obj=new PrintChar('a',5);
		PrintChar obj2=new PrintChar('b',5);
		PrintNum obj3=new PrintNum(5);
		obj.setPriority(Thread.NORM_PRIORITY);
		obj2.setPriority(Thread.NORM_PRIORITY+1);
		obj3.setPriority(Thread.MAX_PRIORITY);
		System.out.println(obj.getPriority());
		obj3.start();
		obj2.start();
		obj.start();
	}

}
