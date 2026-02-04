// Last updated: 2/4/2026, 12:10:58 PM
import java.util.*;

class Solution {
    public int maxFreqSum(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        int maxVowel = 0;
        int maxConsonant = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                char c = (char) (i + 'a');
                if ("aeiou".indexOf(c) >= 0) {
                    maxVowel = Math.max(maxVowel, count[i]);
                } else {
                    maxConsonant = Math.max(maxConsonant, count[i]);
                }
            }
        }
        return maxVowel + maxConsonant;
    }
}

