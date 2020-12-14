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

public class HappyNumber {
    
    // LeetCode 202: Happy Number
    /*
    Write an algorithm to determine if a number n is "happy".

    A happy number is a number defined by the following process: 
        - Starting with any positive integer, replace the number by the sum of the squares of its digits, 
        - and repeat the process until the number equals 1 (where it will stay), 
        - or it loops endlessly in a cycle which does not include 1. 
        - Those numbers for which this process ends in 1 are happy numbers.

    Return True if n is a happy number, and False if not.
    
    */
    
    
    public boolean happyNumber(int n){
        HashSet<Integer> set = new HashSet();
        while(n != 1){
            int sum = 0; 
            int current = n;
            while(current != 0){
                sum += (current %10) * (current % 10);
                current /= 10;
            }
            if(set.contains(sum)) return false;
            set.add(sum);
            n = sum;
        }
        return true; 
    }
    
}
