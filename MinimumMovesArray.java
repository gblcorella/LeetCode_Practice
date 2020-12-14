/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class MinimumMovesArray {
    
    
    public int minMoves(int[] nums){
        if(nums.length == 0) return 0;
        int min = nums[0];
        for(int n : nums) min = Math.min(min, n);
        int res = 0;
        for(int n : nums) res += n - min;
        return res;
    }
}
