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

public class PartitionLabel {
    /*
    
    LeetCode 763: PartitionLabel
    A string S of lowercase English letters is given. We want to partition this string into as many parts as possible 
         so that each letter appears in at most one part,
         and return a list of integers representing the size of these parts.
    
    Input: S = "ababcbacadefegdehijhklij"

    Output: [9,7,8]
    Explanation:

    The partition is "ababcbaca", "defegde", "hijhklij".
    This is a partition so that each letter appears in at most one part.
    A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
    */
    
    public List<Integer> partitionLabel(String s){
        List<Integer> partitionLabels = new ArrayList();
        // Error Checking
        if(s.length() == 0 || s == null) return partitionLabels;
        
        int[] lastIndex = new int[26];
        // The last instance of every character
        for(int i = 0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        int i = 0; 
        while(i < s.length()){
            int end = lastIndex[s.charAt(i) - 'a'];
            int j = i;
            while(j != end){
                end = Math.max(end,lastIndex[s.charAt(j++)-'a']);
            }
            // Zero Based;
            partitionLabels.add(j - i + 1);
            //Continue the loop with j + 1, because of zero based indexing;
            i = j + 1;
        }
        
        return partitionLabels;
    }
    
}
