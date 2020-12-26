/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class Main {
    
    public static void main(String[] args){
        
      // Diagonal Traverse, LeetCode Daily
      
      
      int[][] matrix = new int[][]
      {
          {1,2,3},
          {4,5,6},
          {7,8,9}
      };
        
        DiagonalTraverse dt = new DiagonalTraverse();
        System.out.println(dt.diagonalTraverse(matrix));
    }
}
