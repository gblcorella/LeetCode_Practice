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
public class AddTwoNumbers {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head = null;
    
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }
        
        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        while(s1.size() > 0 || s2.size() > 0 || carry != 0){
            int sum = carry; 
            if(!s1.empty()) sum += s1.pop();
            if(!s2.empty()) sum += s2.pop();
            ListNode new_node = new ListNode(sum % 10);
            new_node.next = head; 
            head = new_node;       
            carry = sum / 10;
        }
       return head;
    }
}
