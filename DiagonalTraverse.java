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


public class DiagonalTraverse {
 
    // Alternate between adding and subtracting 1 to change the direction 
    
    public int[] diagonalTraverse(int[][] matrix){
        
        if(matrix.length == 0) return new int[]{-1};
        
        int row = 0; 
        int col = 0; 
        int d = 1; 
        
        int m = matrix.length;
        int n = matrix[0].length;
        
          
        int[] result = new int[m * n];
        
        for(int i = 0; i < m * n; i++){
            result[i] = matrix[row][col];
            row -= d;
            col += d;
            
            if(row >= m) {row = m -1; col += 2; d = -d;}
            if(col >= n) {col = n -1; row += 2; d = -d;}
            if(row < 0)  {row = 0; d = -d;}
            if(col < 0) {col = 0; d = -d;}
            }
  
        return result;

    }
    /*
    if (row >= m) { row = m - 1; col += 2; d = -d;}
            if (col >= n) { col = n - 1; row += 2; d = -d;}
            if (row < 0)  { row = 0; d = -d;}
    */
    
}
