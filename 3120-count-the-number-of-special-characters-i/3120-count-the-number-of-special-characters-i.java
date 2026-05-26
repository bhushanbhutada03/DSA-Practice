class Solution {
    public int numberOfSpecialChars(String word) {
        int ans =0;

        int[] map=new int[128];

        for(char c:word.toCharArray()){
            map[c]++;
        }

        for(int i=65;i<91;i++){
            if(map[i]>0 && map[i+32]>0) ans++;
        }
        return ans;
    }
}