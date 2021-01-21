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
public class CompetitiveSubsequence {
    
    /*
    Given an integer array nums and a positive integer k, return the most competitive subsequence of nums of size k.
    An array's subsequence is a resulting sequence obtained by erasing some (possibly zero) elements from the array.
    We define that a subsequence a is more competitive than a subsequence b (of the same length) if in the first position where a and b differ, 
    subsequence a has a number less than the corresponding number in b. For example, [1,3,4] is more competitive than [1,3,5] because the first position they differ is at the final number, and 4 is less than 5.

    Example 1:

    Input: nums = [3,5,2,6], k = 2
    Output: [2,6]
    Explanation: Among the set of every possible subsequence: {[3,5], [3,2], [3,6], [5,2], [5,6], [2,6]}, [2,6] is the most competitive.
    */
    
    // Solution 1: Without Stack,
    // Runtime: O(N)
    // Space: O(H)
    
    public int[] mostCompetitive(int[] nums, int k ){
        int[] result = new int[k];
        int top = 0; 
        for(int i = 0;i < nums.length; i++){
            
            while(top > 0 && nums[i] < result[top] && top + nums.length - i > k){
                top--;
            }
            if(top < k){
                result[top++] = nums[i];
            }
        }
        return result;
    }
    
    // Solution 2
    // Runtime: O(N)
    // Space: O(H)
    public int[] stackCompetitive(int[] nums, int k ){
        int[] result = new int[k];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < nums.length; i++){
            while(!stack.isEmpty() && nums[i] < nums[stack.peek()] && stack.size() + nums.length - i > k){
                stack.pop();
            }
            
            if(stack.size() < k){
                stack.push(i); 
            }
        }
        int i = k; 
        while(!stack.isEmpty()){
            result[--i] = nums[stack.pop()];
        }        
        return result;
    }
}
