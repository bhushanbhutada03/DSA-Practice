class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        if(n==1) return 1;
        int ans=0;
        boolean flag=false;

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(char x : map.keySet()){
            if(map.get(x)%2==0){
                ans=ans+map.get(x);
            }
            if(map.get(x)%2!=0 && map.get(x)>1){
                ans=ans+(map.get(x)-1);
                if(flag==false){
                    flag=true;
                }
            }
            if(map.get(x)==1){
                if(flag==false){
                    flag=true;
                }
            }
        }
        if(flag){
            return ans+1;
        }else{
            return ans;
        }
    }
}