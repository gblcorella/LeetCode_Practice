/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */

import java.util.*;
public class ShortestBridge {
    
    public int shortestBridge(int[][] A){
        int m = A.length; 
        int n = A[0].length;
        
        Queue<int[]> queue = new LinkedList();
        int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        boolean[][] visited = new boolean[m][n];
        
        
        boolean found = false;
        
        for(int i = 0; i < m; i++){
            if(found){
                break;
            }
            for(int j = 0; j < n; j++){
                if(A[i][j] == 1){
                    dfs(A,dirs, queue, i, j, visited);
                    found = true; 
                    break;
                }
            }
        }
        
        int bridges = 0; 
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
                int[] curr = queue.poll();
                for(int[] dir : dirs){
                    int x = curr[0] + dir[0];
                    int y = curr[1] + dir[1];
                    
                    if(x > 0 && y > 0 && x < m && y < n && !visited[x][y]){
                        if(A[x][y] == 1){
                            return bridges;
                        }
                        queue.offer(new int[]{x,y});
                        visited[x][y] = true;
                        
                    }
                }
            }
            bridges++;
        }
        return -1;
        
    }
    
    public void dfs(int[][] A, int[][] dirs, Queue<int[]> queue, int i , int j, boolean[][] visited){
        if(i < 0 || i >= A.length || j < 0 || j >= A[0].length || visited[i][j] || A[i][j] == 0){
            return;
        }
        visited[i][j] = true;
        queue.offer(new int[]{i,j});
        for(int[] dir : dirs){
            dfs(A, dirs, queue, i + dir[0], j + dir[1], visited);
        }
        
    }
}
