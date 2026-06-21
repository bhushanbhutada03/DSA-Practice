class Solution {
    public int largestAltitude(int[] gain) {

        for(int i=1;i<gain.length;i++){
            gain[i]=gain[i]+gain[i-1];
        }

        int ans=0;

        for(int i:gain){
            if(i>ans) ans=i;
        }
        return ans;
    }
}