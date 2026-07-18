class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i:nums){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        return gcd(min,max);
    }
    public int gcd(int min,int max){
        if(max==0)return min;
        return gcd(max,min%max);
    }
}