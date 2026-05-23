class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int p1=0;
        int p2=0;
        while(p1<str1.length()){

            if(str1.charAt(p1)==str2.charAt(p2) || (char)(((str1.charAt(p1) - 'a' + 1) % 26) + 'a')== str2.charAt(p2)){
                p2++;
                
            }
            p1++;

            if(p2==str2.length()) return true;
            
        }
        return false;   
    }
}