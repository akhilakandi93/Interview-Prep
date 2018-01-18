package LeetCode;

import java.util.PriorityQueue;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix={{'X','X','X','X','X','X'},{'X','*','O','O','O','X'},{'X','O','O','#','O','X'},{'X','X','X','X','X','X'}};
		System.out.println(getFood(matrix));
	}

	
	
	
public static class Node implements Comparable<Node>{
	    int x,y, dist;
	    Node(int a, int b, int dist){
	        x=a;
	        y=b;
	        this.dist=dist;
	    }
	    
	    @Override
	    public int compareTo(Node n){
	        return this.dist-n.dist;
	    }
	}
	
	    public static int getFood(char[][] grid) {
	        int rows= grid.length;
	        int cols=grid[0].length;
	        
	        
	        
	        Node[][] nodes=new Node[rows][cols];
	        boolean[][] visited=new boolean[rows][cols];
	        Node start=null;
	        Node end=null;
	        for(int i=0;i<rows;i++){
	            for(int j=0;j<cols;j++){
	                nodes[i][j]=new Node(i,j,Integer.MAX_VALUE);
	                if(grid[i][j]=='*'){
	                    start=nodes[i][j];
	                    
	                }
	                if(grid[i][j]=='#'){
	                    end=nodes[i][j];
	                }
	                
	            }
	        }
	        start.dist=0;
	        
	        PriorityQueue<Node> pq=new PriorityQueue<Node>();
	        
	        pq.offer(start);
	        
	        while(!pq.isEmpty()){
	            Node temp=pq.poll();
	            int p=temp.x;
	            int q=temp.y;
	            visited[p][q]=true;
	            for(int i=p-1;i<=p+1;i++){
	                for(int j=q-1;j<=q+1;j++){
	                    if(i<0 || i>rows-1 || j<0 || j>cols-1) continue;
	                    if(visited[i][j]==true || grid[i][j]=='X')continue;
	                    nodes[i][j].dist=1+temp.dist;
	                    pq.offer(nodes[i][j]);
	                }
	            }
	        }
	        return end.dist == Integer.MAX_VALUE ? -1:end.dist;
	    }
	
}
