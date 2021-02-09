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
public class ConvertBSTGreaterTree {
    
    /*
    
    Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original 
    key plus sum of all keys greater than the original key in BST.
    
    
    */
    
    
    // Two Approaches, Iteratively and recursively
    // Recursive
    int sum = 0;
    public TreeNode convertTree(TreeNode root){
        if(root == null) return null;
        convertTreeHelper(root);
        return root;
    }
    public void convertTreeHelper(TreeNode root){
        if(root == null) return;
        convertTreeHelper(root.right);
        root.val += sum;
        sum = root.val;
        convertTreeHelper(root.left);
    }
    
    
    // Iteratively (reverse Inorder traversal and calculate every value)
    
    public TreeNode convertTreeIterative(TreeNode root){
        if(root == null) return null;
        Stack<TreeNode> stack = new Stack();
        TreeNode curr = root;
        int sum = 0;
        while(!stack.isEmpty() || curr != null){
            while(curr != null){
                stack.add(curr);
                curr = curr.right;
            }
            curr = stack.pop();
            int temp = curr.val;
            curr.val += sum;
            sum += temp;
            curr = curr.left;
        }
        return root;
    }
    
    
    
}
