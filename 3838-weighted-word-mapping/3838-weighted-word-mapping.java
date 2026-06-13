class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();

        for(String s:words){
            int sum=0;
            for(char c:s.toCharArray()){
                sum+=weights[c-'a'];
            }
            sum=sum%26;
            sb.append((char)((25-sum)+'a'));
        }
       return sb.toString();
    }
}