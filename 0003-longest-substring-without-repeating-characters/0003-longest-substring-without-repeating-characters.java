class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[128]; // ASCII
        int low = 0, maxLen = 0;

        for (int high = 0; high < s.length(); high++) {
            char c = s.charAt(high);

            if (map[c] > 0) {
                low = Math.max(low, map[c]);
            }

            map[c] = high + 1;
            maxLen = Math.max(maxLen, high - low + 1);
        }
        return maxLen;
    }
}