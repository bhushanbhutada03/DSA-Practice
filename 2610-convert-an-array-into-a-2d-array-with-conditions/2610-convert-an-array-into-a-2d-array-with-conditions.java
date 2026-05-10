class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int num : nums) {
            int row = freq.getOrDefault(num, 0);
            if (row == ans.size()) {
                ans.add(new ArrayList<>());
            }
            ans.get(row).add(num);
            freq.put(num, row + 1);
        }
        return ans;
    }
}