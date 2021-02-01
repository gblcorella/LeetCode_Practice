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
public class MaxCake {
    
    public int maxArea(int h, int w, int[] hc, int[] vc) {
        return (int) ((getMaxDist(h, hc) * getMaxDist(w, vc)) % (Math.pow(10, 9) + 7));
    }
    
    public long getMaxDist(int end, int[] cuts){
        Arrays.sort(cuts);
        long from = 0, res = 0;
        
        for(int c : cuts){
            res = Math.max(res, c - from);
            from = c;
        }
        
        return Math.max(res, end - from);
    }
    
}
