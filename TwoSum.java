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
public class TwoSum {
    
    // Two Sum I
    
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            
            if(map.containsKey(diff)){
                result[0] = i;
                result[1] = map.get(diff);
            }
            map.put(nums[i],i);
        }
        return result;
    }
    
    
    // Two Sum II
    
    public int[] twoSumII(int[] nums, int target){
        if(nums.length == 0 || nums == null) return new int[] {-1,-1};
        
        int a_pointer = 0; 
        int b_pointer = nums.length - 1; 
        
        while(a_pointer <= b_pointer){
            int sum = nums[a_pointer]+ nums[b_pointer];
            if(sum > target){
                b_pointer--;
            } else if(sum < target){
                a_pointer++;
            } else {
                return new int[]{a_pointer + 1, b_pointer+1};
            }
        }
        return new int[]{a_pointer+1, b_pointer + 1};
    }
}
