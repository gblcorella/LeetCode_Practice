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
public class WeakestRows {
    
    
    /*
        Given a m * n matrix mat of ones (representing soldiers) and zeros (representing civilians), 
        return the indexes of the k weakest rows in the matrix ordered from the weakest to the strongest.

        A row i is weaker than row j, if the number of soldiers in row i is less than the number of soldiers in row j,
        or they have the same number of soldiers but i is less than j. Soldiers are always stand in the frontier of a row,
        that is, always ones may appear first and then zeros.
    
        Can also be done using a Binary Search
    
    */
    public int[] kWeakestRows(int[][] mat, int k){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);
        int[] result = new int[k];
        
        for(int i = 0; i < mat.length; i++){
            int soldiers = 0; 
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    soldiers++;
                } else break;
            }
            pq.offer(new int[]{soldiers, i});
        }
        
        while(pq.size() > k){
            pq.poll();
        }
        
        while(k > 0){
            result[--k] = pq.poll()[1];
        }
        
        return result;
    }
}
