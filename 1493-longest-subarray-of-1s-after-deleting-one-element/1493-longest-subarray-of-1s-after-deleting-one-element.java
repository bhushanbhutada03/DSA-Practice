class Solution {
    public int longestSubarray(int[] nums) {

    int ans=0;

    int zeros=0;

    int left=0;
    int right=0;

    if(nums[0] == 0){
        zeros++;
    }

    while(right<nums.length-1) {

            right++;
            if(nums[right]==0){
                zeros++;
            }

            while(zeros>1){
                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }

            if(zeros<2){
                ans=Math.max(ans,right-left);
            }
        }
        return ans;  
    }
}