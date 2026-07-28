class Solution {
    public String smallestPalindrome(String s) {

        int[] cnt = new int[26];

        for (char ch : s.toCharArray()) {
            cnt[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        char middle = 0;

        for (int i = 0; i < 26; i++) {

            while (cnt[i] >= 2) {
                left.append((char) ('a' + i));
                cnt[i] -= 2;
            }

            if (cnt[i] == 1) {
                middle = (char) ('a' + i);
            }
        }

        StringBuilder ans = new StringBuilder();

        ans.append(left);
        if (middle != 0)
            ans.append(middle);

        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}