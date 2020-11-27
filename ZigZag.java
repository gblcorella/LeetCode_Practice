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
public class ZigZag {
    
    
    public List<List<Integer>> zigZagLevelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            int depth = 0; 
            List<Integer> level = new LinkedList<>();
            for(int i = 0; i < size; i++){
                
                TreeNode current = queue.remove();
                
                if(depth % 2 == 0){
                    level.add(current.val);
                } else {
                    level.add(0, current.val);
                }

                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            depth++;
            result.add(level);
        }
        
        return result;
    }
}
