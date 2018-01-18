package LeetCode;

import java.util.*;

public class leetCodeQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix={{'X','X','X','X','X','X'},{'X','*','O','O','O','X'},{'X','O','O','#','O','X'},{'X','X','X','X','X','X'}};
			//{{'*','O','X','#'},{'X','O','O','O'},{'X','X','X','O'},{'X','X','X','O'},{'#','X','X','X'},{'#','X','X','#'}};
		System.out.println();
		System.out.println("FOOD "+getFood(matrix));
	}

	private static int getFood(char[][] matrix) {
		int[][] grid=new int[matrix.length][matrix[0].length];
		int m=0,n=0;
		HashMap<Integer,ArrayList> hmap=new HashMap<Integer,ArrayList>();
		List<int[]> coordinates=new ArrayList<int[]>();
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;j++){
				if(matrix[i][j]=='X'){
					grid[i][j]=-1;
				}else if(matrix[i][j]=='O'){
					grid[i][j]=0;
				}else if(matrix[i][j]=='*'){
					grid[i][j]=1;
					m=i;
					n=j;
				}else if(matrix[i][j]=='#'){
					if(hmap.containsKey(i)){
						ArrayList<Integer> l=hmap.get(i);
						l.add(j);
						hmap.put(i, l);
					}else{
						ArrayList<Integer> l=new ArrayList<Integer>();
						l.add(j);
						hmap.put(i, l);
					}
				}
			}
			
		}
		if(hmap.size()==0){
			return -1;
		}
		System.out.println(hmap);
		for(int i=0;i<grid.length;i++){
			System.out.println();
			for(int j=0;j<grid[0].length;j++){
				System.out.print(grid[i][j]+" ");
			}
		}
		
		explorePath(grid,hmap,m,n);
		for(int i=0;i<grid.length;i++){
			System.out.println();
			for(int j=0;j<grid[0].length;j++){
				System.out.print(grid[i][j]+" ");
			}
		}
		
		return getMinDist(grid,hmap);
		
		//return 0;
	}

	private static int  getMinDist(int[][] grid, HashMap<Integer, ArrayList> hmap) {
		int dist=Integer.MAX_VALUE;
		Iterator it=hmap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair=(Map.Entry)it.next();
			List<Integer> l=(List<Integer>) pair.getValue();
			for(int i=0;i<l.size();i++){
				if(grid[(int) pair.getKey()][l.get(i)]>0){
					dist=Math.min(grid[(int) pair.getKey()][l.get(i)],dist);
					System.out.println("at "+(int)pair.getKey()+" "+l.get(i));
				}
			}
				
		}
		//System.out.println("from here"+dist);
		return dist==Integer.MAX_VALUE? -1:dist-1;
	}

	private static void explorePath(int[][] grid, HashMap<Integer, ArrayList> hmap, int m, int n) {
		//System.out.println("AT i="+m+" j="+n);
		if(m-1>=0 && grid[m-1][n]==0){
			if(grid[m-1][n]>0){
				grid[m-1][n]=Math.min(grid[m][n]+1, grid[m-1][n]);
				System.out.println("TEST 1");
				if(n-1>=0){
					grid[m-1][n]=Math.min(grid[m-1][n-1]+1, grid[m-1][n]);
				}
				if(n+1<grid[0].length){
					System.out.println("TEST 1");
					grid[m-1][n]=Math.min(grid[m-1][n+1]+1, grid[m-1][n]);
				}
				if(m-2>=0){
					grid[m-1][n]=Math.min(grid[m-2][n]+1, grid[m-1][n]);
				}
			}else{
				
				grid[m-1][n]=grid[m][n]+1;
			}
			System.out.println("AT m= "+(m-1)+" n="+n+" ="+grid[m-1][n]);
			if(hmap.containsKey(m-1)){
				if(!(hmap.get(m-1).contains(n))){
					explorePath(grid,hmap,m-1,n);
				}
			}else{
			explorePath(grid,hmap,m-1,n);
			}
		}
		if(m+1<grid.length && grid[m+1][n]==0){
			if(grid[m+1][n]>0){
				System.out.println("TEST 2");
				grid[m+1][n]=Math.min(grid[m][n]+1, grid[m+1][n]);
				if(n+1<grid[0].length){
					System.out.println("TEST 2");
					grid[m+1][n]=Math.min(grid[m+1][n+1]+1, grid[m+1][n]);
				}
				if(m+2<grid.length){
					System.out.println("TEST 2");
					grid[m+1][n]=Math.min(grid[m+2][n]+1, grid[m+1][n]);
				}
				if(m+1>=0){
					System.out.println("TEST 2");
					grid[m+1][n]=Math.min(grid[m+1][n-1]+1, grid[m+1][n]);
				}
			}else{
				grid[m+1][n]=grid[m][n]+1;
			}
			System.out.println("AT m= "+(m+1)+" n="+n+" ="+grid[m+1][n]);
			if(hmap.containsKey(m+1)){
				if(!(hmap.get(m+1).contains(n))){
					explorePath(grid,hmap,m+1,n);
				}
			}else{
			explorePath(grid,hmap,m+1,n);
			}
		}
		if(n-1>=0 && grid[m][n-1]==0){
			if(grid[m][n-1]>0){
				grid[m][n-1]=Math.min(grid[m][n]+1, grid[m][n-1]);
				if(n-2>=0)
					grid[m][n-1]=Math.min(grid[m][n-2]+1, grid[m][n-1]);
				if(m+1<grid.length)
				grid[m][n-1]=Math.min(grid[m+1][n-1]+1, grid[m][n-1]);
				if(m-1>=0)
				grid[m][n-1]=Math.min(grid[m-1][n-1]+1, grid[m][n-1]);
				
			}else{
				grid[m][n-1]=grid[m][n]+1;
			}
			System.out.println("AT m= "+m+" n="+(n-1)+" ="+grid[m][n-1]);
			if(hmap.containsKey(m)){
				if(!(hmap.get(m).contains(n-1))){
					explorePath(grid,hmap,m,n-1);
				}
			}else{
			explorePath(grid,hmap,m,n-1);
			}
		}
		if(n+1<grid[0].length && grid[m][n+1]==0){
			if(grid[m][n+1]>0){
				grid[m][n+1]=Math.min(grid[m][n]+1, grid[m][n+1]);
				if(m+1<grid.length){
					grid[m][n+1]=Math.min(grid[m+1][n+1]+1, grid[m][n+1]);
				}
				if(n+2<grid[0].length){
					grid[m][n+1]=Math.min(grid[m][n+2]+1, grid[m][n+1]);
				}
				if(m-1>=0){
					grid[m][n+1]=Math.min(grid[m-1][n+1]+1, grid[m][n+1]);
				}
			}else{
				grid[m][n+1]=grid[m][n]+1;
			}
			System.out.println("AT m= "+m+" n="+(n+1)+" ="+grid[m][n+1]);
			if(hmap.containsKey(m)){
				if(!(hmap.get(m).contains(n+1))){
					explorePath(grid,hmap,m,n+1);
				}
			}else{
			explorePath(grid,hmap,m,n+1);
			}
		}
		
		
	}

	

}
