class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], x -> new ArrayList<>()).add(i);
        }

        int ans = 0;

        for (List<Integer> list : map.values()) {
            if (list.size() != 3) {
                continue;
            }

            int diff = list.get(1) - list.get(0);

            if (list.get(2) - list.get(1) == diff) {
                ans++;
            }
        }

        return ans;
    }
}