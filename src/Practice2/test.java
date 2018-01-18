package Practice2;

public class test {
	public static boolean f(double x){
		return (x!=0) && (-0.001<1/x) && (1/x<0.001);
	}
	
	public static void main(String args[]){
		System.out.println(fib(10000));
	}

	private static int fib(int i) {
		if(i==0) return 0;
		if(i==1) return 1;
		return fib(i-1) + fib(i-2);
		
	}
}
