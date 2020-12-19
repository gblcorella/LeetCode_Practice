/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class CherryPicker {
    public int cherryPickup(int[][] grid) {
         int m = grid.length, n = grid[0].length;
        // dp[r][c1][c2]: starting from row r, column c1 and c2, max # of cherries.
        int[][][] dp = new int[m][n][n];
        for(int r = m - 1; r >= 0; r--) {
            for(int c1 = 0; c1 < n; c1++) {
                for(int c2 = 0; c2 < n; c2++) {
                    int val = (c1 == c2) ? grid[r][c1] : grid[r][c1] + grid[r][c2];
                    if(r == m - 1) {
                        dp[r][c1][c2] = val;
                        continue;
                    }
                    int next = 0;
                    for(int i = -1; i <= 1; i++) {
                        for(int j = -1; j <= 1; j++) {
                            int c1_n = c1 + i, c2_n = c2 + j;
                            if(c1_n >= 0 && c1_n < n && c2_n >= 0 && c2_n < n) {
                                next = Math.max(next, dp[r + 1][c1_n][c2_n]);
                            }
                        }
                    }
                    dp[r][c1][c2] = val + next;
                }
            }
        }
        return dp[0][0][n - 1];
    }
    
}
