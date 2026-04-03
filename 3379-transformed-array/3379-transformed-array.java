class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] result =new int[n];

        for(int i=0; i<n; i++){
            if(nums[i]>0){
                int index = (i+nums[i]) % n;
                result[i] = nums[index];
            }else if(nums[i]<0){
                int index = (( i + nums[i]) % n + n) % n;
                result[i] = nums[index];
            }else{
                result[i]=nums[i];
            }
        }
        return result;
    }
}