package Practice3;

public class search2DMatrix {

	public static void main(String[] args) {
		int[][] grid={
		              {1,   3,  5,  7},
		              {10, 11, 16, 20},
		              {23, 30, 34, 50}
		};
		check(grid,4);
		

	}

	private static void check(int[][] grid, int target) {
		int i=0,j=grid[0].length-1;
		while(i<grid.length && grid[i][j]<target){
			i++;
		}
		System.out.println(binarySearch(grid[i],target,0,grid[0].length-1));
	}

	private static boolean binarySearch(int[] grid, int target,int start,int end) {
		if(start<end){
		int mid=start+(end-start)/2;
		if(grid[mid]==target){
			return true;
		}else if(grid[mid]>target){
			return binarySearch(grid,target,start,mid-1);
		}else{
			return binarySearch(grid,target,mid+1,end);
		}
		}else{
			return false;
		}
		
	}

}
