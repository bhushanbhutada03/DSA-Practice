class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=Integer.MIN_VALUE;

        for(int i:costs){
            if(i>max) max=i;
        }

        int[] count=new int[max+1];

        for(int i:costs){
            count[i]++;
        }

        int ans=0;
        int i=0;

        while(i < count.length){
        if(count[i] == 0){
            i++;
        }else if(coins >= i){
            coins -= i;
            count[i]--;
            ans++;
        }else{
            break;
        }
    }
        return ans;
    }
}