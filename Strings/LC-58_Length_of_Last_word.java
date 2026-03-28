class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int length=0;
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                length++;
            }
            if(length!=0 && s.charAt(i)==' '){
                break;
            }
        }
        return length;
    }
}