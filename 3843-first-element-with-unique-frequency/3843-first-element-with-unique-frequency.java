class Solution {
    public int firstUniqueFreq(int[] nums) {

        Map<Integer, Integer> cnt = new HashMap<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
        }

        for (int f : cnt.values()) {
            map.put(f, map.getOrDefault(f, 0) + 1);
        }

        for (int x : nums) {
            if (map.get(cnt.get(x)) == 1) {
                return x;
            }
        }
        return -1;
    }
}
