class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] map = new int[51];

        int left = 0;
        int right = k - 1;

        while (right <nums.length) {

            boolean[] seen = new boolean[51];

            for (int i = left; i <= right; i++) {
                seen[nums[i]] = true;
            }

            for (int i = 0; i <= 50; i++) {
                if (seen[i]) {
                    map[i]++;
                }
            }

            left++;
            right++;
        }

        for (int i = 50; i >= 0; i--) {
            if (map[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}