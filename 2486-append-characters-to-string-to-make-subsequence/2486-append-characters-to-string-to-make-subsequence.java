class Solution {
    public int appendCharacters(String s, String t) {
        int n=t.length();

        int ponT=0;

        for(int i=0;i<s.length();i++){
            if(ponT==n) return 0;

            if(s.charAt(i)==t.charAt(ponT)){
                ponT++;
            }
        }
        return n-ponT;
    }
}