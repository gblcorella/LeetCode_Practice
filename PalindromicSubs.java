/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class PalindromicSubs {
 
   
    public int countSubstrings(String s) {
        
        if(s.length() == 0 || s == null){
            return 0; 
        }
        
        int count = 0; 
        
        for(int i = 0; i < s.length(); i++){
            count += expandPalindrom(s, i, i);
            count += expandPalindrom(s, i, i+1);
        }
        return count;
    }
    
    
    public int expandPalindrom(String s, int left, int right){
        int count = 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}
    
    

