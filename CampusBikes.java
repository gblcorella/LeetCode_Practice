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

public class CampusBikes {

    /*
    On a campus represented as a 2D grid, there are Nworkers and Mbikes, with N <= M. Each worker and bike is a 2D coordinate on this grid.

    Our goal is to assign a bike to each worker. Among the available bikes and workers, we choose the (worker, bike) 
    pair with the shortest Manhattan distance between each other, and assign the bike to that worker. (If there are multiple (worker, bike) pairs with the same shortest Manhattan distance, we choose the pair with the smallest worker index; if there are multiple ways to do that, we choose the pair with the smallest bike index). We repeat this process until there are no available workers.

    The Manhattan distance between two points p1and p2is Manhattan(p1, p2) = |p1.x - p2.x| + |p1.y - p2.y|. 
    Return a vector ansof length N, where ans[i]is the index (0-indexed) of the bike that the i-th worker is assigned to.
    */
    
    public int[] assignBikes(int[][] workers, int[][] bikes){
        int n = workers.length; 
        int m = bikes.length;
        
        boolean[] occupied = new boolean[m];
        boolean[] assigned = new boolean[n];
        int[] res = new int[n];
        
        List<int[]>[] list = new List[20001];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < bikes.length; j++){
                int dist = distance(workers[i],bikes[j]);
                if(list[dist] == null){
                    list[dist] = new ArrayList();               
                }
                list[dist].add(new int[]{i,j});
            }
        }
        for(int i = 0; i < 2001; i++){
            if(list[i] == null) continue;
            int size = list[i].size();
            for(int j = 0; j < size; j++){
                int w = list[i].get(j)[0];
                int b = list[i].get(j)[1];
                
                if(!occupied[b] && !assigned[w]){
                    res[w] = b;
                    assigned[w] = true;
                    occupied[b] = true;
                }
            }
        }
        return res;
     
    }
    
    private int distance(int[] w, int[] b){
        return Math.abs(w[0] - b[0]) + Math.abs(w[1] - b[1]);
    }
}
