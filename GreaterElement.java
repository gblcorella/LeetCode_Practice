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
public class GreaterElement {
    public int nextGreatestIII(int n){
        char[] number = (n + "").toCharArray();
        
        int i; 
        int j;
        
        int length = number.length;
        for(i = length - 1; i > 0; i--){
            if(number[i - 1] < number[i]){
                break;
            }
        }
        if (i == 0){
            return -1; 
        }
        
        int x = number[i-1];
        int smallest = i;
        
       for(j = i + 1; j < length - 1; j++){
           if(number[j] > x && number[j] <= number[smallest]){
               smallest = j;
           }
       }
       
       char temp = number[i-1];
       number[i-1] = number[smallest];
       number[smallest] = temp;
       
       Arrays.sort(number, i, length);
       
           
       long val = Long.parseLong(new String(number));
       return val <= Integer.MAX_VALUE ? (int) val : -1;
    }
    
    // Leetcode 496
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap();
        Stack<Integer> stack = new Stack();
        
        for(int num: nums2){
            while(!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}
