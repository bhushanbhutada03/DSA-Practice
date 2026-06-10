class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {

        int[] freq = new int[10001];

        for (int x : barcodes) {
            freq[x]++;
        }

        int maxNum = 0;

        for (int i = 1; i <= 10000; i++) {
            if (freq[i] > freq[maxNum]) {
                maxNum = i;
            }
        }

        int[] ans = new int[barcodes.length];

        int idx = 0;

        while (freq[maxNum] > 0) {
            ans[idx] = maxNum;
            idx += 2;
            freq[maxNum]--;
        }

        for (int num = 1; num <= 10000; num++) {

            while (freq[num] > 0) {

                if (idx >= barcodes.length) {
                    idx = 1;
                }

                ans[idx] = num;
                idx += 2;
                freq[num]--;
            }
        }

        return ans;
    }
}