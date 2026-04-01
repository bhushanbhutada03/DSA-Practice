class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        List<Integer> ls = new ArrayList<>();

        for (int j = 1; j <= nums.length; j++) {
            if (!set.contains(j)) {
                ls.add(j);
            }
        }
        return ls;
    }
}