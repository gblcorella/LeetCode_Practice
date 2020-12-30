/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class LowestCommonAncestor {
    
    // Lowest Common Ancestor in a Binary Search Tree
    /*
    Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

    According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes
    p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
    
    */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return null; 
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q);
        } else if (p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right,p,q);
        } else {
            return root;
        }
    }
    
    
    public TreeNode lcaBinaryTree(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return null;
        TreeNode left = lcaBinaryTree(root.left, p,q);
        TreeNode right = lcaBinaryTree(root.right, p,q);
        if(left != null && right != null) return root;
        return left != null ? left : right;
    }
}
