class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int[] map=new int[100];
        for(int i:nums){
            if(map[i-1]<k){
                map[i-1]++;
            }
        }
        int point=0;
    
        for(int i=0;i<100;i++){
            if(map[i]>0){
                while(map[i]!=0){
                    nums[point]=i+1;
                    point++;
                    map[i]--;
                }
            }
        }
        return Arrays.copyOf(nums, point);
    }
}