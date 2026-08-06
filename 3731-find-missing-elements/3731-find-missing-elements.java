class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int[] map=new int[100];

        for(int i:nums){
            max = Math.max(max,i);
            min = Math.min(min,i);
            map[i-1]++;
        }

        List<Integer> ans=new ArrayList<>();

        for(int k=min+1;k<max;k++){
            if(map[k-1]==0)ans.add(k);
        }
        return ans;
    }
}