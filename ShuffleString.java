/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class ShuffleString {
    
    public String restoreString(String s, int[] indices){
        int length = indices.length;
        char[] newString = new char[length];
        for(int i = 0; i < indices.length; i++){
            newString[indices[i]] = s.charAt(i);
        }
        return new String(newString);
    }
}
