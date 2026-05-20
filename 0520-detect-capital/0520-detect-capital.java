class Solution {
    public boolean detectCapitalUse(String word) {
        String s1=word.toUpperCase();
        String s2=word.toLowerCase();

        if(word.equals(s1)) return true;
        if(word.equals(s2)) return true;

        if(word.charAt(0)==s2.charAt(0)){
            return false;
        }else{
            for(int i=1;i<word.length();i++){
                if(word.charAt(i)!=s2.charAt(i))return false;
            }
        }
        
    return true;
    }
}