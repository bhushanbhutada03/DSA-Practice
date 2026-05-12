class Solution {
    public char repeatedCharacter(String s) {
        int[] map=new int[26];
        char ans='a';

        for(int i=0;i<s.length();i++){
            if(map[s.charAt(i)-'a']>0){
                ans=s.charAt(i);
                break;
            }
            map[s.charAt(i)-'a']++;
        }
        return ans;
    }
}