package Practice3;

public class maximumSubArraySum {

	public static void main(String[] args) {
		int[] nums={-100,-20,-1};
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<nums.length;i++){
			if(sum+nums[i]<nums[i]){
				max=Math.max(max,Math.max(sum+nums[i], nums[i]));
				sum=max;
			}else{
				sum=sum+nums[i];
				max=Math.max(max, sum);
			}
		}
		System.out.println(Math.max(sum, max));
	}

}
