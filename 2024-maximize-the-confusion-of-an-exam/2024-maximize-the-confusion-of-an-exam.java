class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        
        int ans=1;

        int t=0;
        int f=0;

        if(answerKey.charAt(0)=='T'){
            t++;
        }else{
            f++;
        }

        int left=0;
        int right=0;

        while(right<answerKey.length()-1){
            right++;
            if(answerKey.charAt(right)=='T'){
                t++;
            }else{
                f++;
            }

            while(t>k && f>k){
                if(answerKey.charAt(left)=='T'){
                    t--;
                }else{
                    f--;
                }
                left++;
            }

            if(t<=k || f<=k){
                ans=Math.max(ans,right-left+1);
            }

        }
        return ans;
    }
}