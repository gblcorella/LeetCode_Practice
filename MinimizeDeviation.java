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
public class MinimizeDeviation {
    /*
    HARD
    
    You are given an array nums of n positive integers.
    You can perform two types of operations on any element of the array any number of times:

    If the element is even, divide it by 2.
        For example, if the array is [1,2,3,4], then you can do this operation on the last element, and the array will be [1,2,3,2].
    If the element is odd, multiply it by 2.
        For example, if the array is [1,2,3,4], then you can do this operation on the first element, and the array will be [2,2,3,4].

    The deviation of the array is the maximum difference between any two elements in the array.

    Return the minimum deviation the array can have after performing some number of operations.

    Example 1:

    Input: nums = [1,2,3,4]
    Output: 1
    Explanation: You can transform the array to [1,2,3,2], then to [2,2,3,2], then the deviation will be 3 - 2 = 1.
    */
     public int minimumDeviation(int[] nums){
         int diff = Integer.MAX_VALUE;
         TreeSet<Integer> set = new TreeSet();
         for(int el : nums){
             if(el % 2 == 1){
                 set.add(el * 2);
             } else {
                 set.add(el);
             }
         }
         
         while(true){
             int minVal = set.first();
             int maxVal = set.last();
             int currDiff = maxVal - minVal;
             diff = Math.min(currDiff, diff);
             if(maxVal % 2 == 0){
                 set.remove(maxVal);
                 set.add(maxVal / 2);
             } else {
                 return diff;
             }
         }
     }
}
