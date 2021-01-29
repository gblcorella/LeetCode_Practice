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

public class InorderSuccessor {
    
    
    // Given a binary search tree and a node in it, find the in-order successor of that node in the BST.
    
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p){
        // Error / Type checking
        
        if(root == null || p == null){
            return null;
        }
        
        if(p.right != null){
            return findMin(p.right);
        }
        // Case 2:
        TreeNode successor = null;
        TreeNode q = root;
        
        while(q != null){
            if(q.val > p.val){
                successor = q;
                q = q.left;
            } else if (q.val < p.val){
                q = q.right;
            } else {
                break;
            }
        }
        return successor;
    }
    
    
    public TreeNode findMin(TreeNode root){
        TreeNode curr = root;
        while(curr.left != null){
            curr = curr.left;
        }
        return curr;
    }
}

