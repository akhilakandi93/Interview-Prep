package Practice2;
import java.util.UUID;

public class tinyURL {

	public static void main(String[] args) {
		int[] array={2,5,4,7};
		next_prime(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}

	public static void next_prime(int[] nums) {
		for(int i=0;i<nums.length;i++){
			if(!isPrime(nums[i])){
				nums[i]=getPrime(nums[i]);
			}
		}
	}

	public static boolean isPrime(int num){
		for(int i=2;i<num/2;i++){
			if(num%i==0){
				return true;
			}
		}
		return false;
	}
	
	public static int getPrime(int num) {
		num++;
		while(isPrime(num)){
			num++;
		}
		return num;
	}
	

}
