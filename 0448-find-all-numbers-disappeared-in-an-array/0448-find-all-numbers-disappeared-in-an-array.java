class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> ls = new ArrayList<>();

        for (int j = 1; j <= nums.length; j++) {
            if (!map.containsKey(j)) {
                ls.add(j);
            }
        }
        return ls;
    }
}