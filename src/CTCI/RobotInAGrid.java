package CTCI;
import java.util.*;
public class RobotInAGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<Integer>();
		l.add(1, 0);
		System.out.println(l);
		 List<List<Integer>> ll=new ArrayList<List<Integer>>();
        int[][] grid={{0,0,0},{0,1,0},{0,0,1}};
        int m=grid.length;
        int n=grid[0].length;
      // System.out.println( goDestination(grid,m-1,n-1));
	}

	private static int goDestination(int[][] grid,int m,int n) {
		// TODO Auto-generated method stub
		if(m==0 || n==0){
			if(grid[m][n]!=1){
				return 1;
			}
		}
		if(grid[m][n]==1){
			return Integer.MAX_VALUE;
		}
		return Math.min(goDestination(grid,m-1,n), goDestination(grid,m,n-1));
	}

}
