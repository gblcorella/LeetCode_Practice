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
public class WordLadder {
    
    /*
    Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
    Output: 5
    Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog", return its length 5.
    */

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet();
        for(String word : wordList){
            set.add(word);
        }
        if(!set.contains(endWord)){
            return 0;
        }
        
        Queue<String> queue = new LinkedList();
        queue.offer(beginWord);
        int level = 1;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                String current_word = queue.poll();
                char[] word_chars = current_word.toCharArray();
                for(int j = 0; j < word_chars.length; j++){
                    char original_char = word_chars[j];
                    for(char c='a';c <='z';c++){
                        if(word_chars[j] == c) continue;
                        word_chars[j] = c;
                        String new_word = String.valueOf(word_chars);
                        if(new_word.equals(endWord)) return level + 1;
                        if(set.contains(new_word)){
                            queue.offer(new_word);
                            set.remove(new_word);
                        }
                    }
                    word_chars[j] = original_char;
                }
            }
            level++;
        }
        return 0;
    }
}

