class Solution {
    public int maxProduct(int n) {
        int[] digit=new int[10];
        int i=0;


        while(n!=0){
            digit[i]=n%10;
            i++;
            n/=10;
        }

        int max1=Integer.MIN_VALUE;
        int max1Ind=-1;

        for(int j=0;j<i;j++){
            if(digit[j]>max1){
                max1=digit[j];
                max1Ind=j;
            }
        }

        int max2=Integer.MIN_VALUE;

        for(int k=0;k<i;k++){
            if(max1Ind==k)continue;
            
            if(digit[k]>max2 ){
                max2=digit[k];
            }
        }

        return max1*max2;
    }
}