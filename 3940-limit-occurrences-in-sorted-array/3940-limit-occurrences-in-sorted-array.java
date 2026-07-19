class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int[] ans = new int[nums.length];

        int write = 0;
        int count = 0;
        int prev = -1;

        for (int num : nums) {
            if (num != prev) {
                prev = num;
                count = 1;
            } else {
                count++;
            }
            if (count <= k) {
                ans[write++] = num;
            }
        }
        return Arrays.copyOf(ans, write);
    }
}