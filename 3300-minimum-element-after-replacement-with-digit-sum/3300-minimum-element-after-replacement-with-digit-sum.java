class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int sum=0;
            int x=nums[i];
            while(x>0){
                sum=sum+(x%10);
                x=x/10;
            }
            if(sum<min){
                min=sum;
            }
        }
        return min;
    }
}