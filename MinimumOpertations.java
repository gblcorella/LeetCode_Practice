/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class MinimumOpertations {
    
    /*
    You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost or the rightmost element 
    from the array nums and subtract its value from x. Note that this modifies the array for future operations.

    Return the minimum number of operations to reduce x to exactly 0 if it's possible, otherwise, return -1.

    Example 1:

    Input: nums = [1,1,4,2,3], x = 5
    Output: 2
    Explanation: The optimal solution is to remove the last two elements to reduce x to zero.

    */
    
    public int minimumOperations(int[] nums, int k){
        int sum = 0; 
        int target = -k;
        int res = -1;
        int left = 0;
        for(int i : nums){
            target += i;
        }
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum > target){
                sum -= nums[left++];
            }
            if(sum == target){
                res = Math.max(res, i - left + 1);
            }
        }
        
        return res == -1 ? -1 : nums.length - res;
    }
    
}
