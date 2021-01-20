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

public class MaxAreaCake {
    public int maxArea(int h, int w, int[] hc, int[] wc){
        return (int)((getDist(h, hc) * getDist(w,wc)) %  (Math.pow(10,9)+7));
    }
    
    private long getDist(int end, int[] cuts){
        Arrays.sort(cuts);
        long res = 0; 
        long from = 0; 
        for(int c : cuts){
            res = Math.max(res,c - from);
            from = c;
        }
        return Math.max(res, end - from);
    }
}
