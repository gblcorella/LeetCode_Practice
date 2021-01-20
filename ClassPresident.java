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
public class ClassPresident {
    
    /*
    High school students are voting for their class president and you’re tasked with counting the votes. 
    Each presidential candidates is represented by a unique integer and the candidate that should win the election is the 
    candidate that has received more than half the votes. Given a list of integers, return the candidate that should become the class president.
    Note: You may assume there is always a candidate that has received more than half the votes.

    Ex: Given the following votes…

    votes = [1, 1, 2, 2, 1], return 1.
    Ex: Given the following votes…

    votes = [1, 3, 2, 3, 1, 2, 3, 3, 3], return 3.
    */
    
    public int classPresident(int[] votes){
        HashMap<Integer,Integer> map = new HashMap();
        for(int i : votes){
            if(map.containsKey(i)){
                map.put(i, map.getOrDefault(i,0) + 1);
            } else {
                map.put(i, 1);
            }
        }
        
        Map.Entry<Integer,Integer> maxEntry = null;
       
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > maxEntry.getValue()){
                maxEntry = entry;
            }
        }
        return maxEntry == null ? -1 : maxEntry.getValue();
    }
    
}
