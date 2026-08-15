class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n];

        int ans=helper(n,dp);

        return ans;
    }
    
    public static int helper(int n,int[] dp){

        if(dp[n-1]!=0) return dp[n-1];

        if (n <= 2){
            dp[n-1]=n;
            return n;
        } 

        int ans=helper(n-1,dp) + helper(n-2,dp);

        dp[n-1]=ans;

        return ans;
    }
}