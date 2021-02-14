/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class L988 {
    
    /*
    Given the root of a binary tree, each node has a value from 0 to 25 representing the letters 'a' to 'z':
        a value of 0 represents 'a', a value of 1 represents 'b', and so on.

    Find the lexicographically smallest string that starts at a leaf of this tree and ends at the root.

    (As a reminder, any shorter prefix of a string is lexicographically smaller: for example, "ab" is 
    lexicographically smaller than "aba".  A leaf of a node is a node that has no children.)
    
    */
    
    public String smallestFromLeaf(TreeNode root){
        if(root == null) return null;
        String[] result = new String[]{null};
        dfsBacktrack(root, new StringBuilder(), result);
        return result[0]; 
    }
    
    
    public void dfsBacktrack(TreeNode root, StringBuilder sb, String[] result){
        if(root == null) return;
        
        sb.append((char) ('a' + root.val));
        
        if(root.left == null && root.right == null){
            String coordinate = new StringBuilder(sb).reverse().toString();
            if(result[0] == null || result[0].compareTo(coordinate) > 0){
                result[0] = coordinate;
            }
        } else{
            
        }
        sb.setLength(sb.length() - 1);
    }
}
