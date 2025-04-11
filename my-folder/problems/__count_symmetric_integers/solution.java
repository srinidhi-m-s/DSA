class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int digit;int sum;int count=0;
        while(low<=high){
            digit=(int)Math.floor(Math.log10(low))+1;
            if((digit%2!=0)){
                low++;
                continue;
            }int temp=low; 
            sum=0;
            for(int i=0;i<digit/2;i++){
                sum+=temp%10;
                temp/=10;
            }for(int i=0;i<digit/2;i++){
                sum-=temp%10;
                temp/=10;
            }
            if(sum==0) count++;            
            low++;
        }
        return count;
    }
}