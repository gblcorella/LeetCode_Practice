/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class LongestPalindromicSubstring {
    
    public String longestPalindromicSubstring(String s){
        if(s == null || s.length() == 0) return null;
        int start = 0; 
        int end = 0; 
        
        for(int i = 0; i < s.length(); i++){
            int len1 = lengthPalindrome(s, i, i);
            int len2 = lengthPalindrome(s, i, i+1);
            int max = Math.max(len1,len2);
            
            if(max > end - start){
                start = i - (max -1)/2;
                 end = i + (max /2);
            }
        }
        return s.substring(start,end+1);
    }
    
    
    
    public int lengthPalindrome(String s, int left, int right){
        if(s.length() == 0) return 0; 
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}
