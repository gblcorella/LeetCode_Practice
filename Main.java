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

    public static void main(String[] args) {

        // Diagonal Traverse, LeetCode Daily
        int[][] matrix = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        String word = "stackoverflow";
        String[] book = new String[9];
        book[0] = "st";
        book[1] = "ck";
        book[2] = "CAG";
        book[3] = "low";
        book[4] = "TC";
        book[5] = "rf";
        book[6] = "ove";
        book[7] = "a";
        book[8] = "sta";
        
        String secondWord = "aaa";
        String[] secondBook = new String[3];
        secondBook[0] = "a";
        secondBook[1] = "aa";
        secondBook[2] = "aaa";
        
        RecreateString rs = new RecreateString();
       // System.out.print(rs.method(word, book)); // Output: 2
       // System.out.print(rs.method(secondWord, secondBook)); //  Output: 4
       
       BeautifulArrangement ba = new BeautifulArrangement();
       // System.out.println(ba.countArrangement(3));
       
       LongestSubstringWithoutRepeating leet = new LongestSubstringWithoutRepeating();
       String test = "abcabcbb";
        System.out.println(leet.longestSubstring(test));
    }
}
