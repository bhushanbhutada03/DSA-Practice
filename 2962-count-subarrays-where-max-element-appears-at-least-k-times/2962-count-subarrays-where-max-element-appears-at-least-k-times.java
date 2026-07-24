class Solution {
    public long countSubarrays(int[] nums, int k) {

        int maxEl=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>maxEl)maxEl=i;
        }

        long ans=0;
        int count=0;

        int left=0;
        int right=0;
        
        if(nums[0]==maxEl)count++;

        while(right<nums.length){
            while(count>=k){
                ans+=nums.length-right;
                if(nums[left]==maxEl)count--;
                left++;
            }
            right++;
            if(right!=nums.length){
                if(nums[right]==maxEl)count++;
            }
            
        }
        return ans;
    }
}