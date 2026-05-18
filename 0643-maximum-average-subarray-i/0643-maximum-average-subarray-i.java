class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int start =0;
        int end=k-1;
        double sum=0;

        for(int i=start;i<=end;i++){
            sum=sum+nums[i];
        }

        double ans=sum/k;

        while(end<nums.length-1){
            end++;
            sum=sum+nums[end];
            sum=sum-nums[start];
            start++;
            
            double av=sum/k;
            if(av>ans)ans=av;
        }
        return ans;
    }
}