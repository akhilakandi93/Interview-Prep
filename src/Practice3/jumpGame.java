package Practice3;

public class jumpGame {

	public static void main(String[] args) {
		int[] nums={3,2,1,0,4};
		System.out.println(jump(nums));

	}
	
	public static boolean jump(int[] nums){
		int count=0;
		for(int i=nums.length-1;i>=0;i--){
			int j=i-1;
			count=1;
			System.out.println(i+" -> "+j);
			while(j>=0 && nums[j]<count){
				j--;
				count++;
			}
			System.out.println("j= "+j);
			i=j+1;
		}
		
		if(nums[0]>=count) return true;
		return false;
	}
}
