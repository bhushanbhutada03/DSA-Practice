class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr=new int[nums.length];

        int p1=0;

        for(int x : nums){
            if(x<pivot){
                arr[p1]=x;
                p1++;
            }
        }

        for(int x:nums){
            if(x==pivot){
                arr[p1]=x;
                p1++;
            }
        }

        for(int x:nums){
            if(x>pivot){
                arr[p1]=x;
                p1++;
            }
        }

    return arr;
    }
}