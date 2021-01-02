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
public class FormConcatanation {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer,int[]> map = new HashMap();
        int start = 0; 
        
        for(int[] piece : pieces){
            map.put(piece[0],piece);
        }
        
        while (start < arr.length){
            if(map.containsKey(arr[start])){
                int[] curr = map.get(arr[start]);
                for(int i = 0; i < curr.length; i++){
                    if(arr[start] != curr[i]){
                        return false;
                    } else {
                        start++;
                    }
                }
            } else{
                return false;
            }
        }
        return true; 
    }
}
