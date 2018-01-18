package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class leetcodeTrail2 {

	public static void main(String[] args) {
		char[][] matrix={{'X','X','X','X','X','X'},{'X','*','O','O','O','X'},{'X','O','O','#','O','X'},{'X','X','X','X','X','X'}};
		
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		System.out.println(matrix[1].length);
		System.out.println(matrix[3].length);
		
		//getFood(matrix);
	
	}

	private static int getFood(char[][] matrix) {
		int[][] grid=new int[matrix.length][matrix[0].length];
		int x=0,y=0;
		HashMap<Integer, ArrayList<Integer>> hmap=new HashMap<Integer,ArrayList<Integer>>();
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;j++){
				if(matrix[i][j]=='X'){
					grid[i][j]=-1;
				}else if(matrix[i][j]=='O'){
					grid[i][j]=0;
				}else if(matrix[i][j]=='*'){
					grid[i][j]=0;
					x=i;
					y=j;
				}else if(matrix[i][j]=='#'){
					grid[i][j]=0;
					if(hmap.containsKey(i)){
						ArrayList l=hmap.get(i);
						l.add(j);
						hmap.put(i, l);
					}else{
						hmap.put(i, new ArrayList(j));
					}
				}
			}
		}
		
		if(hmap.size()==0){
			return -1;
		}
		
		explorePath(grid,hmap,x,y);
		return 0;
		
	}

	private static void explorePath(int[][] grid, HashMap<Integer, ArrayList<Integer>> hmap, int m, int n) {
		// TODO Auto-generated method stub
		if(m-1>=0 && grid[m-1][n]==0){
			
		}
		
		if(m+1<grid.length && grid[m+1][n]==0){
			
		}
		
		if(n-1>=0 && grid[m][n-1]==0){
			
		}
		if(n+1<grid[0].length && grid[m][n+1]==0){
			
		}
		
		
		
	}

}
