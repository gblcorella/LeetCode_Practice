/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class VowelDynamic {
    
    
    /*
        Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u) and 
        are lexicographically sorted.

        A string s is lexicographically sorted if for all valid i,
        s[i] is the same as or comes before s[i+1] in the alphabet.
    
        Input: n = 1
        Output: 5
        Explanation: The 5 sorted strings that consist of vowels only are
        ["a","e","i","o","u"].
    */
        public int countVowelStrings(int n) {
        int[][] dp = new int[n + 1][6];
        for (int i = 1; i <= n; ++i)
            for (int k = 1; k <= 5; ++k)
                dp[i][k] = dp[i][k - 1] + (i > 1 ? dp[i - 1][k] : 1);
        return dp[n][5];
      }
}
