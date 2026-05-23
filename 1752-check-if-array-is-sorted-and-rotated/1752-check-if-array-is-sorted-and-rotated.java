class Solution {
    public boolean check(int[] nums) {
        boolean flag=false;
        int count=0;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                flag=true;
                count++;
                if(count>1){
                    return false;
                }
            }
            
        }
        if(flag==false && nums[nums.length-1]>nums[0]){
                return true;
            }
            if(flag==true && nums[nums.length-1]>nums[0]){
                return false;
            }
            return true;
    }
}