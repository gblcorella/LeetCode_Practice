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
import java.util.List;
public class TopKFrequent {
    
    
    public int[] topKFrequent(int[] nums, int k){
        if(nums == null || nums.length == 0){
            return new int[]{0,0};
        }        
        
        // Map for frequencies
        Map<Integer,Integer> map = new HashMap();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        List<Integer> list = new ArrayList<>();
        
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            maxHeap.add(entry);
        }
        
        while(list.size() < k){
            Map.Entry<Integer,Integer> current = maxHeap.poll();
            list.add(current.getKey());
        }
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size();i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
    
}
