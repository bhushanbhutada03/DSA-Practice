class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        int[] count = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if (s == g) {
                bulls++;
            } else {
                // secret se aya → increase
                if (count[s - '0'] < 0) cows++;
                count[s - '0']++;

                // guess se aya → decrease
                if (count[g - '0'] > 0) cows++;
                count[g - '0']--;
            }
        }

        return bulls + "A" + cows + "B";
    }
}
