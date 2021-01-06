/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class TargetCopy {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target){
        if(original == null || original == target){
            return cloned;
        }
        TreeNode res = getTargetCopy(original.left, cloned.left, target);
        // If not in the left, it must be in the right;
        if(res != null){
            return res;
        } 
        // return right;
        return getTargetCopy(original.right, cloned.right, target);
    }
}
