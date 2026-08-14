class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int n=Math.min(prices.length,discounts.length);

        double ans=0;

        int j=discounts.length-1;

        for(int i=prices.length-1;i>=0;i--){
            if(n>0){
                ans+=(prices[i]*(100.0-discounts[j]))/100;
                j--;
                n--;
            }else{
                ans+=prices[i];
            }
        }
        return ans;
    }
}