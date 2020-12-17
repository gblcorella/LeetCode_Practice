

/**
 *
 * @author gabecorella
 * 
 *   All of these problems are inOrder Traversals of a binary tree. Study the template and skeleton code 
 */

import java.util.*;

public class InOrderTraversals {
 
    
    // Validates a Binary Search Tree Iteratively through the use of a stack 
    public boolean isValidBST(TreeNode root){
        if(root == null) return true; 
        Stack<TreeNode> stack = new Stack();
        TreeNode pre = null;
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(pre != null && root.val <= pre.val) return false;
            root = root.right;
        }
        return true;
    }
    
    // Kth Smallest Element 
    
    public int kthSmallest(TreeNode root, int k){
        if(root == null) return -1;
        Stack<TreeNode> stack = new Stack();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.right;
            }
            
            root = stack.pop();
            if(--k == 0){
                break;
            }
            root = root.right;
        }
        return root.val;
    }
    
    
    
    // Inorder Binary Tree Traversal
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        
        if(root == null) return result;
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }
        
        return result;
    }
}
