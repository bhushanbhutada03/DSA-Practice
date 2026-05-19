class Solution {
    public String longestPalindrome(String s) {
        char[] arr=s.toCharArray();
        int ansLen=1;
        int ansStart=0;
        int ansEnd=0;

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(isPalin(arr,i,j)){
                    if((j-i+1)>ansLen){
                        ansLen = j - i + 1;
                        ansStart=i;
                        ansEnd=j;
                    }
                }
                
            }
        }
        return s.substring(ansStart,ansEnd+1);
    }
    Boolean isPalin(char[] ch,int s,int e){
        while(e>s){
            if(ch[s]==ch[e]){
                e--;
                s++;
            }else{
                return false;
            }
        }
        return true;
    }
}