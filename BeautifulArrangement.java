/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class BeautifulArrangement {
    
    // LeetCode daily 
    
    // Global return variable count = 0; 
    int count = 0;
    
    public int countArrangement(int n){
        if(n == 0) return 0;
        int[] nums = new int[n + 1];
        dfs(nums, 1, n);
        return count;
        
    }
    
    // Dfs helper function 
    
    public void dfs(int[] nums, int val, int n){
        if(val > n){
            count++;
            return;
        }
        
        for(int i = 1; i <= n; i++){
            if(nums[i] == 0 && (val % i== 0 || i % val == 0)){
                nums[i] = val;
                dfs(nums, val + 1, n);
                nums[i] = 0;
            }
        }
    }
    
}
