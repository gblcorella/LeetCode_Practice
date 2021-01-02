/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class RecreateString {

    public long method(String word, String[] book) {
        // Construct a trie from all the words in book.

        // Construct an array to memoize the number of ways to construct
        // prefixes of a given length: result[i] is the number of ways to
        // construct a prefix of length i.
        long[] result = new long[word.length() + 1];

        // There is only 1 way to construct a prefix of length zero.
        result[0] = 1;

        for (int m = 0; m < word.length(); ++m) {
            if (result[m] == 0) {
                // If there are no ways to construct a prefix of this length,
                // then just skip it.
                continue;
            }

            // Walk the trie, taking the branch which matches the character
            // of word at position (n + m).
            for (String b : book) {
                if (word.regionMatches(m, b, 0, b.length())) {
                    result[m + b.length()] += result[m];
                }
            }
        }

        // The number of ways to reach a prefix of length (word.length())
        // is now stored in the last element of the array.
        return result[word.length()];
    }
}
