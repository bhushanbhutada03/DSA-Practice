class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        helper(0,s,new char[s.length()]);
        return ans;
    }
    public void helper(int index,String s,char[] string){
        if(index==s.length()){
            ans.add(new String(string));
            return; 
            }
        char c=s.charAt(index);
        
        if(Character.isLetter(c)){
            string[index]=Character.toLowerCase(c);
            helper(index+1,s,string);
        
            string[index]=Character.toUpperCase(c);
            helper(index+1,s,string);
        }else{
            string[index]=c;
            helper(index+1,s,string);
        }
    }
}