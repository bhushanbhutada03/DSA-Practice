class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder ans=new StringBuilder();

        Map<String,String> map=new HashMap<>();

        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }


        int right=-1;
        int left=-1;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='(')left=i;
            if(s.charAt(i)==')')right=i;

            if(right!=-1 && left!=-1){
                String key=s.substring(left+1,right);
                ans.append(map.getOrDefault(key, "?"));
                left=-1;
                right=-1;
            }else if(left==-1){
                ans.append(s.charAt(i));
            }
            
        }
        return ans.toString();
    }
}