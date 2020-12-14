/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class GoodPairs {
    public int goodPairs(int[] nums){
        int count = 0; 
        int[] freq = new int[101];
        for(int a : nums){
            count += freq[a]++;
        }       
        return count;
    }
}
