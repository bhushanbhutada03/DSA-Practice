class Solution {
    public int[] resultArray(int[] nums) {
        
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int k=2;k<nums.length;k++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                arr1.add(nums[k]);
            }else{
                arr2.add(nums[k]);
            }
        }

        int[] result=new int[nums.length];
        int pointer=0;

        for(int x:arr1){
            result[pointer++]=x;
        }

        for(int x:arr2){
            result[pointer++]=x;
        }

        return result;
    }
}