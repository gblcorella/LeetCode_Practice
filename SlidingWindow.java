/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class SlidingWindow {
    public int maxScore(int[] cardpoints, int k){
        int n = cardpoints.length; 
        int leftSum = 0; 
        
        for(int i = 0; i < k; i++){
            leftSum += cardpoints[i];
        }
        int result = leftSum;
        for(int rSum = 0, i = 0; i < k; i++){
            rSum += cardpoints[n-1-i];
            leftSum -= cardpoints[k-1-i];
            result = Math.max(result, rSum + leftSum);
        }
        return result;
    }
}
