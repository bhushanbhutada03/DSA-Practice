class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;

        int[] map=new int[128];

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)<97){
                if(map[word.charAt(i)]==0){
                    map[word.charAt(i)]=i+1;
                }   
            }else{
                map[word.charAt(i)]=i+1;
            }
            
        }

        for(int j=65;j<91;j++){
            if(map[j]>0 && map[j+32]>0 && map[j]>map[j+32]){ 
                count++;
            }
        }
        return count;
    }
}