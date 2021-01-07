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

public class LongestSubstringWithoutRepeating {
    
    // Input String s = "abcabcbb"
    // Output: 3, beacause 'abc'
    
    public int longestSubstring(String s){
        int max = 0; 
        // Error Checking
        if(s.length() == 0) return 0;
        HashMap<Character,Integer> map = new HashMap();
        for(int i = 0, j = 0; i < s.length(); i++){
            // If weve seen a character already update j to the next index;
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
