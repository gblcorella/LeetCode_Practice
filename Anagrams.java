/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class Anagrams {
    
    
    boolean isAnagram(String s, String g){
        int count = 0; 
        if(s.length() != g.length()){
            return false; 
        }
        
        for(int i = 0; i < s.length(); i++){
            count += s.charAt(i);
        }
        
        for(int i = 0; i < g.length(); i++){
            count -= g.charAt(i);
        }
   
        return count == 0;
    }
    
}
