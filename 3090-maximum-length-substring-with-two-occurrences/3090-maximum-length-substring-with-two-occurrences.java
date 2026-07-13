class Solution {
    public int maximumLengthSubstring(String s) {
        int[] map=new int[26];

        int ans=1;

        int left=0;
        int right=0;

        map[s.charAt(left)-'a']++;
        int count=1;

        while(right<s.length()-1){
            right++;
            map[s.charAt(right)-'a']++;
            count++;

            if(map[s.charAt(right)-'a']>2){
                while(map[s.charAt(right)-'a']>2){
                    map[s.charAt(left)-'a']--;
                    left++;
                    count--;
                }
            }
            if(count>ans)ans=count;
        }
        return ans;
    }
}