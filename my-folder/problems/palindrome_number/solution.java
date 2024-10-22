class Solution {
    public boolean isPalindrome(int x) {
        int pal=0;int num=x;int rem;
        if(x<0){
            return(false);
        }
        while(x>0){
            
            rem=x%10;
            pal=(pal*10)+rem;
            x=x/10;
        }
        if(pal==num){
            return(true);
        }else{
            return(false);
        }
    }
}