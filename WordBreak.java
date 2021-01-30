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
public class WordBreak {
    
    // Dynamic Programming question 
    
     public boolean wordBreak(String s, List<String> wordDict){
         int n = s.length();
         boolean[] dp = new boolean[n + 1];
         
         dp[0] = true; 
         int maxLength = 0; 
         for(String word : wordDict){
             maxLength = Math.max(maxLength, s.length());
         }
         for(int i = 0; i <= n; i++){
             for(int j = 0; j < i; j++){
                 if(i - j > maxLength) continue;       
                 if(dp[j] && wordDict.contains(s.substring(j, i))){
                     dp[i] = true;
                 }
             }
         }   
         return dp[n];
     }
}
