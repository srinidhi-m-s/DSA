class Solution {
    public double myPow(double x, int n) {
        if(x==0) return 0;
        if(n==0) return 1;
        double ans=1.0;  long nn=n;
        if(n<0){
            nn=-nn;
        } 
          
        while(nn>0){
            if(nn%2==0){
                x=x*x;
                nn=nn/2;
            }
            else{
                ans=ans*x;
                nn=nn-1;
            }
        }  
        if(n<0){
            return 1/ans;
        }      
        return ans;
    }
}