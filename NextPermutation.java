/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class NextPermutation {
    
    
    /*
    Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

    If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).

    The replacement must be in place and use only constant extra memory.

    Example 1:
    Input: nums = [1,2,3]
    Output: [1,3,2]

    Example 2:
    Input: nums = [3,2,1]
    Output: [1,2,3]

     TAKE BIGGER EXAMPLES AND NOTICE THE PATTERN AND THE TWO POINTER APPROACH OF ITERATING BACKWARDS
    */
    
    public void nextPermutation(int[] nums){
        if(nums.length <= 1 || nums == null) return; 
        
        int i = nums.length - 2;
        while( i >= 0 && nums[i] >= nums[i+1]) i--; 
        if(i >= 0){
            int j = nums.length - 1; 
            while(nums[j] <= nums[i])j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
        
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void reverse(int[] nums, int i , int j){
        while(i  < j){
            swap(nums, i++, j--);
        }
    }
}
