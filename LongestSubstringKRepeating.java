/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class LongestSubstringKRepeating {
    
    public int longestSubstring(String s, int k){
        
        if(s.length() == 0) return 0; 
        if(k < 0) throw new IllegalArgumentException("K can not be negative");
        
        boolean isValid = true;
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
       
        for(char c : chars){
            int index = c - 'a';
            freq[index]++;
        }
        int start = 0; 
        int maxLength = 0;
        for(int end = 0; end < s.length(); end++){
            if(freq[chars[end]-'a'] > 0 && freq[chars[end] - 'a'] < k){
                String sub = s.substring(start,end);
                maxLength = Math.max(maxLength, longestSubstring(sub,k));
                start = end + 1;
                isValid = false;
            }
        }
        
        if(isValid){
            return s.length();
        } else {
           return Math.max(maxLength, longestSubstring(s.substring(start),k));
        }
    }
}
