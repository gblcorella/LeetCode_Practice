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

public class SmallestRange {
    
    
    // 910: Smallest Ranges II 
     public int smallestRangeII(int[] A, int K) {
       
        
        Arrays.sort(A);
        int n = A.length;
        int result = A[n -1] - A[0];
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            int high = Math.max(A[n-1]-K, A[i] + K);
            int low  = Math.min(A[0] + K, A[j] - K);
            result = Math.min(result, high - low);
        }
        return result;  
     }
     
     
     
     /*
     
     Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K, and add x to A[i].

     After this process, we have some array B.

     Return the smallest possible difference between the maximum value of B and the minimum value of B.  
     
     */
     
     public int smallestRange(int[] A, int K){
         
         int min_val = A[0];
         int max_val = A[0];
         for(int i = 0; i < A.length; i++){
             min_val = Math.min(min_val, A[i]);
             max_val = Math.max(max_val, A[i]);
         }
         
         if(min_val + K >= max_val - K){
             return 0;
         } else {
             return (max_val - K) - (min_val + K);
         }
     }
     
}
