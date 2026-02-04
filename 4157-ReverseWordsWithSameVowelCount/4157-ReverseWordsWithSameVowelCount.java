// Last updated: 2/4/2026, 12:10:56 PM
class Solution {
    public String reverseWords(String s) {
       String parivontel = s;   
        String[] w = parivontel.split(" ");
        
        int base = countVowels(w[0]);

        for (int i = 1; i < w.length; i++) {
            if (countVowels(w[i]) == base) {
                w[i] = new StringBuilder(w[i]).reverse().toString();
            }
        }
        return String.join(" ", w);
    }

    private int countVowels(String x) {
        int c = 0;
        for (char ch : x.toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) c++;
        }
        return c;
     
    }
}