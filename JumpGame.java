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

public class JumpGame {
    // LeetCode Jump Game I,II,III
    
    
    // Jump Game I
    public boolean canJump(int[] nums){
        int lastPossibleJump = nums.length -1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(i + nums[i] >= lastPossibleJump){
                lastPossibleJump = i;
            }
        }
        return lastPossibleJump == 0;
    }
    
    
    // Jump Game II
    // Greedy Algorithm 
    public int canJumpII(int[] nums){
        int jumps = 0; 
        int currEnd = 0; 
        int currFarthest = 0; 
        
        for(int i =0; i < nums.length -1; i++){
            currFarthest = Math.max(currFarthest, i + nums[i]);
            if(i == currEnd){
                jumps++;
                currEnd = currFarthest;
            }
        }
        return jumps;
    }
    
    
    // Jump Game III
    // Two Solutions, BFS and recursive with a flag 
    // Solution 1:
    public boolean  canReach_p1(int[] arr, int start) {
        
        if(start < 0 || start >= arr.length) return false;
        if(arr.length == 0) return false;
        
        Queue<Integer> queue = new LinkedList();
        boolean[] visited = new boolean[arr.length];
        
        queue.offer(start);
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
                Integer head = queue.poll();
                if(arr[head] == 0) return true;
                if(!visited[head]){
                    int forwardIndex = head + arr[head];
                    
                    if(forwardIndex >= 0 && forwardIndex < arr.length){
                        queue.offer(forwardIndex);
                    } 
                    
                    int backwardIndex = head - arr[head];
                    if(backwardIndex > 0 && backwardIndex < arr.length){
                        queue.offer(backwardIndex);
                    }
                    
                    visited[head] = true;
                }
            }
        }
        return false;
    }
    // DFS, Flag the searched number until we reach out of bounds or we hit 0
    public boolean canReach_pII(int[] nums, int start){
        if(start < 0 || start >= nums.length || nums[start] < 0) return false;
        if(nums[start] == 0) return true;
        nums[start] = -nums[start];
        return canReach_pII(nums, start + nums[start]) || canReach_pII(nums, start - nums[start]);
    }
}
