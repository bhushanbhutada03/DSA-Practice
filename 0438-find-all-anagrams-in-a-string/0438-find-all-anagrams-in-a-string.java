class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans=new ArrayList<>();

        if (p.length() > s.length()) return ans;

        int[] needed=new int[26];
        int[] actual =new int[26];

        int left=0;
        int right=p.length()-1;

        for(char c:p.toCharArray()){
            needed[c-'a']++;
        }

        for(int i=left;i<=right;i++){
            actual[s.charAt(i)-'a']++;
        }

        if(helper(needed,actual)){
            ans.add(left);
        }

        while(right<s.length()-1){
            actual[s.charAt(left)-'a']--;
            left++;

            right++;
            actual[s.charAt(right)-'a']++;

            if(helper(needed,actual)){
            ans.add(left);
            }
        }
        return ans;
    }

    boolean helper(int[] arr1,int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}