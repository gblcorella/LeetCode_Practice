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

public class RestaurantDisplay {
    
    // LeetCode 1418:
    /*
    Given the array orders, which represents the orders that customers have done in a restaurant. 
    More specifically orders[i]=[customerNamei,tableNumberi,foodItemi] where customerNamei is the name of the customer, 
    tableNumberi is the table customer sit at, and foodItemi is the item customer orders.

    Return the restaurant's “display table”. The “display table” is a table whose row entries denote how many of each food item each table ordered.
    The first column is the table number and the remaining columns correspond to each food item in alphabetical order. 
    The first row should be a header whose first column is “Table”, followed by the names of the food items. Note that the customer names are not part of the table. 
    Additionally, the rows should be sorted in numerically increasing order.
    
    
    */
    
    
    public List<List<String>> displayTable(List<List<String>> orders){
        List<List<String>> result = new ArrayList();
        List<String> firstRow = new ArrayList();
        firstRow.add("Table");
        
        TreeSet<String> set = new TreeSet<>();
        TreeMap<Integer, Map<String, Integer>> map = new TreeMap();
        
        
        for(List<String> order : orders){
            String dish = order.get(2);
            set.add(dish + "");
            Integer table = Integer.parseInt(order.get(1));
            map.putIfAbsent(table, new HashMap());
            if(map.get(table).containsKey(dish)){
                Map<String, Integer> m = map.get(table);
                m.put(dish, m.getOrDefault(dish, 0) + 1);
            } else {
                map.get(table).put(dish,1);
            }
        }
        
        firstRow.addAll(set);
        result.add(firstRow);
        
        for(Map.Entry<Integer,Map<String,Integer>> entry : map.entrySet()){
            List<String> list = new ArrayList();
            list.add(entry.getKey() + "");
            Map<String,Integer> m = entry.getValue();
            for(String dish : set){
                if(m.containsKey(dish)){
                    list.add(m.get(dish) + "");
                } else {
                    list.add("0");
                }
            }
            result.add(list);
        }
        
        return result;
    }
}
