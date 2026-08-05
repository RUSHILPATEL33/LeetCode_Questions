import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }
        
        StringBuilder firstHalf = new StringBuilder();
        String middleChar = "";
        for (char c = 'a'; c <= 'z'; c++) {
            int idx = c - 'a';
            int count = cnt[idx];
            if (count >= 2) {
                for (int i = 0; i < count / 2; i++) {
                    firstHalf.append(c);
                }
            }
            if (count % 2 == 1) {
                middleChar = String.valueOf(c);
            }
        }
        String left = firstHalf.toString();
        String right = new StringBuilder(left).reverse().toString();
        
        return left + middleChar + right;
    }
}   