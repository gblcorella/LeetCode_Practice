/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class DecodeWays {
    
    /*
    A message containing letters from A-Z is being encoded to numbers using the following mapping:

            'A' -> 1
            'B' -> 2
               ...
            'Z' -> 26

        Given a non-empty string containing only digits, determine the total number of ways to decode it.

        The answer is guaranteed to fit in a 32-bit integer.
    
    Input: s = "12"
    Output: 2
    Explanation: It could be decoded as "AB" (1 2) or "L" (12).
    
    */
    
    public int decodeWays(String s){
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        
        for(int i = 2; i <= s.length(); i++){
            int oneDigit = Integer.valueOf(s.substring(i-1,i));
            int twoDigit = Integer.valueOf(s.substring(i-2,i));
            
            if(oneDigit >= 1){
                dp[i] += dp[i-1];
            }
            if(twoDigit >= 10 && twoDigit <= 26){
                dp[i] += dp[i-2];
            }
        }
        
        return dp[s.length()];
    }
    
}
