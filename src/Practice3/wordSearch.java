package Practice3;
import java.util.*;
public class wordSearch {

	public static void main(String[] args) {
		char[][] grid={{'a','b','c','a'},{'p','c','c','b'},{'x','d','d','e'}};
		//System.out.println(exists(grid,"abcde"));
		long[] nums=new long[1000000];
		System.out.println(nums.length);
		List<Long> ll=new ArrayList<Long>(1000000);
		for(long i=0;i<1000000;i++){
			ll.add(i);
		}
		//System.out.println(ll.get(0).);
		System.out.println(ll.size());
	}
	
	public static boolean exist(char[][] grid, String word){
		boolean[][] visited=new boolean[grid.length][grid[0].length];
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;j++){
				if(grid[i][j]==word.charAt(0)){
					if(checks(grid,word,i,j,visited,1)) return true;
				}
			}
		}
		return false;
	}
	
	public static boolean checks(char[][] grid, String word,int i,int j,boolean[][] visited, int index){
		if(index==word.length()){
			return true;
		}
		
		if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || visited[i][j]){
			return false;
		}
		if(grid[i][j]!=word.charAt(index)){
			return false;
		}
		
		if(checks(grid,word,i-1,j,visited,index+1) || checks(grid,word,i+1,j,visited,index+1) || checks(grid,word,i,j-1,visited,index+1) || checks(grid,word,i,j+1,visited,index+1)){
			return true;
		}
		visited[i][j]=false;
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	public static boolean exists(char[][] grid, String word){
		 List<String> ll=new ArrayList<String>();
	        for(int i=0;i<grid.length;i++){
	            for(int j=0;j<grid[0].length;j++){
	                if(grid[i][j]==word.charAt(0)){
	                    checkNeighbours(grid,word,i,j,ll,0,1);
	                    if(ll.size()!=word.length()){
	                        ll.clear();
	                    }else{
	                    	System.out.println(ll);
	                        return true;
	                    }
	                }
	            }
	        }
	        if(ll.size()==word.length()){
	            return true;
	        }
	        return false;
		
	}
	
	public static void checkNeighbours(char[][] grid, String word, int i,int j, List<String> l,int index, int size){
        System.out.println(l+" "+index);
        if(i>0 && l.size()<word.length() && index+1<word.length()){
        	if(l.size()>size) l.subList(size,l.size()).clear();
            if(grid[i-1][j]==word.charAt(index+1) && !l.contains(String.valueOf(i-1)+String.valueOf(j))){
                l.add(String.valueOf(i)+String.valueOf(j));
                if(index+2==word.length()){
                    l.add(String.valueOf(i-1)+String.valueOf(j));
                }else{
                checkNeighbours(grid,word,i-1,j,l,index+1, size+1);
                }
            }
        }
        if(i<grid.length-1 && l.size()<word.length() && index+1<word.length()){
           if(l.size()>size) l.subList(size,l.size()).clear();
            if(grid[i+1][j]==word.charAt(index+1) && !l.contains(String.valueOf(i+1)+String.valueOf(j))){
                l.add(String.valueOf(i)+String.valueOf(j));
                if(index+2==word.length()){
                    l.add(String.valueOf(i+1)+String.valueOf(j));
                }else{
                checkNeighbours(grid,word,i+1,j,l,index+1,size+1);
                }
            }
        }
        if(j>0 && l.size()<word.length() && index+1<word.length()){
            if(l.size()>size) l.subList(size,l.size()).clear();
            if(grid[i][j-1]==word.charAt(index+1) && !l.contains(String.valueOf(i)+String.valueOf(j-1))){
                l.add(String.valueOf(i)+String.valueOf(j));
                if(index+2==word.length()){
                    l.add(String.valueOf(i)+String.valueOf(j-1));
                }else{
                checkNeighbours(grid,word,i,j-1,l,index+1,size+1);
                }
            }
        }
        if(j<grid[0].length-1 && l.size()<word.length() && index+1<word.length()){
            if(l.size()>size) l.subList(size,l.size()).clear();
            if(grid[i][j+1]==word.charAt(index+1) && !l.contains(String.valueOf(i)+String.valueOf(j+1))){
                l.add(String.valueOf(i)+String.valueOf(j));
                if(index+2==word.length()){
                    l.add(String.valueOf(i)+String.valueOf(j+1));
                }else{
                checkNeighbours(grid,word,i,j+1,l,index+1,size+1);
                }
            }
        }
    }  


}
