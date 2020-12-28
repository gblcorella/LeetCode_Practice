/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class ReachNumber {
    public int reachNumber(int target){
        target = Math.abs(target);
        if(target == 0) return 0;
        
        int sum = 0; 
        int steps = 0; 
        
        while(sum < target){
            sum += steps;
            steps++;
        }
        
        while((sum - target) % 2 == 1){
            sum += steps;
            steps++;
        }
        return steps-1;
    }
}
