/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class Main {
    
    public static void main(String[] args){
        
      // Use for tests and Debug
       
       ConvertTitles ct = new ConvertTitles();
       System.out.println(ct.convertTitle(26));

      int[] top = {1,1,1,2,2,3};
      int k = 2;
       
      TopKFrequent topNotch = new TopKFrequent();
        System.out.println(topNotch.topKFrequent(top, k));
        
    }
   
    
}
