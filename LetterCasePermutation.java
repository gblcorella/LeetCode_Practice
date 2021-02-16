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
public class LetterCasePermutation {
    /*
    Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.

    Return a list of all possible strings we could create. You can return the output in any order.

    Example 1:

    Input: S = "a1b2"
    Output: ["a1b2","a1B2","A1b2","A1B2"]

    */
    
    
    public List<String> lettercasePermutation(String S){
        List<String> result = new ArrayList();
        if(S == null || S.length() == 0) return result;
        
        // backtrack function
        backtrack(S.toCharArray(), 0, result);
        
        return result;
    }
    
    // Backtrack void function to add elements to result;
    // If, 
    public void backtrack(char[] chars, int i, List<String> result){
        if(i == chars.length){
            result.add(new String(chars));
        } else {
            if(Character.isLetter(chars[i])){
                chars[i] = Character.toUpperCase(chars[i]);
                backtrack(chars, i + 1, result);
                chars[i] = Character.toLowerCase(chars[i]);
                backtrack(chars, i + 1, result);
            } else {
                backtrack(chars, i + 1, result);
            }
        }
    }
}
