package LeetCode;

public class climbingStairs {

	public static void main(String[] args) {
		System.out.println(climbingStairs(6));
			System.out.println(stairs(6));
	}

	private static int climbingStairs(int n) {
		int[] steps=new int[n+1];
		stairs(n,steps);
		return steps[n];
	}
	
	private static int stairs(int n, int[] steps) {
		if(n<=0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		if(steps[n]==0){
			steps[n]=stairs(n-1,steps)+stairs(n-2,steps)+stairs(n-3,steps);
		}
		return steps[n];
	}

	public static int stairs(int n){
		if(n<0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		return stairs(n-1)+stairs(n-2)+stairs(n-3);
	}

}
