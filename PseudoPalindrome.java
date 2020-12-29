/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class PseudoPalindrome {
    
    
    // LeetCode 1457: Pseudo Palindrome
    // Time: O(N)
    // Space: O(H)
    int result = 0;
    public int pseudoPalindrome(TreeNode root){
        int[] map = new int[10];
        dfs(root, map);
        return result;
    }
    
    public void dfs(TreeNode root, int[] map){
        if(root == null) return;
        
        map[root.val]++;
        if(root.left == null && root.right == null){
            if(isPalindrome(map)){
                result++;
            }
        }
        
        dfs(root.left, map);
        dfs(root.right, map);
        map[root.val]--;
    }
    
    public boolean isPalindrome(int[] map){
        int odd = 0;
        for(int i = 0; i <= 9; i++){
            if(map[i] % 2 == 1){
                odd++;
            }
            if(odd > 1) return false;
        }
        
        return true;
    }
}
