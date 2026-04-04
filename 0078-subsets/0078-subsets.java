class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        fun(nums,nums.length,0,temp,ans);
        return ans;
    }
    public void fun(int[] nums, int n,int i, List<Integer> temp, List<List<Integer>> ans){
            if(i==n){
                ans.add(new ArrayList<>(temp));
                return;
            }
            temp.add(nums[i]);
            fun(nums,n,i+1,temp,ans);
            temp.remove(temp.size()-1);
            fun(nums,n,i+1,temp,ans);

    }
}