/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class ConvertTitles {
    public String convertTitle(int n){
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            n--;
            sb.append((char) ('A' + n % 26));
            n /= 26;
        }
        
        return sb.reverse().toString();
    }
}
