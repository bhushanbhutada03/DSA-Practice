class Solution {
    public int findJudge(int n, int[][] trust) {
        int ans=-1;

        int[] map=new int[n+1];

        for(int i=0;i<trust.length;i++){
            if(map[trust[i][0]]!=-1){
                map[trust[i][0]]=-1;
            }
        }
        int count=0;
        int judge=-1;

        for(int i=1;i<=n;i++){
            if(map[i]!=-1){
                count++;
                judge=i;
            }
            if(count>1){
                return -1;
            }
        }
        if(count==0) return -1;

        count=0;
        
        for(int i=0;i<trust.length;i++){
            if(trust[i][1]==judge) count++;
        }

        if(count==n-1){
            ans=judge;
        }

        return ans;
    }
}