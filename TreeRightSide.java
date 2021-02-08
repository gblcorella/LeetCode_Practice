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

public class TreeRightSide {

        
    // print tree from the right side 
    // Level Order traversal with condition regarding size
    
    public List<Integer> rightView(TreeNode root){
        List<Integer> result = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        
        if(root == null) return result;
        
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode current = queue.remove();
                if(i == size - 1) result.add(current.val);
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
        }
        return result;
    }
}
