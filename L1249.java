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
public class L1249 {
    
    /*
       Given a string s of '(' , ')' and lowercase English characters. 

        Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.

    Formally, a parentheses string is valid if and only if:

    It is the empty string, contains only lowercase characters, or
    It can be written as AB (A concatenated with B), where A and B are valid strings, or
    It can be written as (A), where A is a valid string.

    Example 1:   
    Input: s = "lee(t(c)o)de)"
    Output: "lee(t(c)o)de"
    Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
    
    */
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack();
        
        for(int i = 0; i < s.length(); i++){
            if(sb.charAt(i) == '('){
                stack.add(i);
            }
            if(sb.charAt(i) == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                } else {
                    sb.setCharAt(i, '*');
                }
            }
        }
        while(!stack.isEmpty()){
            sb.setCharAt(stack.pop(), '*');
        }
        return sb.toString().replace("\\*","");
    }
}
