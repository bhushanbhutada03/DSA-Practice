class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int distinct=set.size();

        Map<Integer,Integer> map=new HashMap<>();

        int ans=0;

        int left=0;
        int right=0;

        while(right<nums.length){
             map.put(nums[right],map.getOrDefault(nums[right], 0) + 1);
             

            while(map.size()==distinct){
                ans+=nums.length-right;
                
                map.put(nums[left], map.get(nums[left]) - 1);

                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }

                left++;
                
            }
            right++;
        }
    return ans;
    }
}