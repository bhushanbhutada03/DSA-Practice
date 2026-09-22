class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int index=(nums.length/2);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[index] && i!=index){
                return false;
            }
        }
        return true;
    }
}