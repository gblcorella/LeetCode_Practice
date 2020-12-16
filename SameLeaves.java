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
public class SameLeaves {
 
    // DFS 
    public boolean sameLeaves(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        
        List<Integer> list1; 
        List<Integer> list2; 
        
        list1 = getLeaves(root1, new ArrayList());
        list2 = getLeaves(root2, new ArrayList());
        
        if(list1.size() != list2.size()) return false;
        for(int i = 0; i < list1.size();i++){
            if(list1.get(i) != list2.get(i)) return false;
        }
        return true;
    }
    
    public List<Integer> getLeaves(TreeNode root, List<Integer> res){
        if(root == null) return res;
        if(root.left == null && root.right == null){
            res.add(root.val);
        }
        getLeaves(root.left, res);
        getLeaves(root.right, res);
        return res;
    }
    
}
