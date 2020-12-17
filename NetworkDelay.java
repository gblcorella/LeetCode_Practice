/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */

// Dijkstras algorithm 

import java.util.*;

public class NetworkDelay {
    
    public int networkDelayTime(int[][] times, int N, int K){
        
        Map<Integer, Map<Integer,Integer>> map = new HashMap();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0] - b[0]);
        boolean[] visited = new boolean[N + 1];
        int result = 0;
        
        for(int[] time : times){
            map.putIfAbsent(time[0], new HashMap());
            map.get(time[0]).put(time[1], time[2]);
        }
        
        pq.offer(new int[]{0,K});
        
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int currNode = curr[1];
            int currDist = curr[0];
            if(visited[currNode]) continue;
            visited[currNode] = true;
            result = currDist;
            N--;
            if(map.containsKey(currNode)){
                for(int next : map.get(currNode).keySet()){
                    pq.offer(new int[]{currDist + map.get(currNode).get(next),next});
                }
            }
        }
       
        return N ==  0 ? result : -1;
    }
    
}
