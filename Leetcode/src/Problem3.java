package Leetcode.src;

import java.util.HashSet;

public class Problem3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> set = new HashSet<>();
            int maxLength = 0;
            int left = 0;

            for (int right = 0; right < s.length(); right++) {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            }
            return maxLength;
        }
    }

    // Main method for testing the solution
    public static void main(String[] args) {
        Problem3 problem = new Problem3();
        Solution solution = problem.new Solution();

        // Test cases
        String test1 = "abcabcbb";
        String test2 = "bbbbb";
        String test3 = "pwwkew";

        System.out.println("Test 1 (abcabcbb): " + solution.lengthOfLongestSubstring(test1)); // Expected output: 3
        System.out.println("Test 2 (bbbbb): " + solution.lengthOfLongestSubstring(test2));    // Expected output: 1
        System.out.println("Test 3 (pwwkew): " + solution.lengthOfLongestSubstring(test3));   // Expected output: 3
    }
}
