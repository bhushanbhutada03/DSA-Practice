class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0;
        int a=0;
        int l=0;
        int o=0;
        int n=0;

        for(char c:text.toCharArray()){
            if(c=='b'){
                b++;
            }else if(c=='a'){
                a++;
            }else if(c=='l'){
                l++;
            }else if(c=='o'){
                o++;
            }else if(c=='n'){
                n++;   
            }
        }

        int count=0;

        while(b>0 && a>0 && l>1 && o>1 && n>0){
            count++;
            b--;
            a--;
            l=l-2;
            o=o-2;
            n--;
        }
        return count;
    }
}