/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class NumberOnes {
    
    // LeetCode daily, number of ones (Bit Manipulation)
    public int numberOnes(int n){
        int ones = 0;
        while(n != 0){
            ones = ones + (n & 1);
            n = n>>>1;
            
        }
        return ones;
    }
}
