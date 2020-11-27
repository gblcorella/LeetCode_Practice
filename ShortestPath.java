

/**
 *
 * @author gabecorella
 */


import java.util.*;
public class ShortestPath {
    
    // BFS
    
    private int dir[][] = new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,-1},{-1,1},{-1,-1},{1,1}};
    public int shortestPathBinaryMatrix(int[][] grid){
        
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        visited[0][0] = true;
        Queue<int[]> queue = new LinkedList<>();
     
        if(grid[0][0] == 1 || grid[m-1][n-1] == 1){
            return -1;
        } 
        
        while(!queue.isEmpty()){
            int size = queue.size();
            int[] curr = queue.poll();
            
            for(int i = 0; i < 8; i++){
                
            }
        }
        
        return 1;
    }
    
    
}
