class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        String digits = "123456789";

        for (int leng = 2; leng <= 9; leng++) {
            for (int start = 0; start + leng <= 9; start++) {
                int num = Integer.parseInt(digits.substring(start, start + leng));

                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }

        return ans;
    }
}