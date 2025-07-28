class Solution {
    public int reverse(int x) {
        int a=0;boolean flag=false;int digit=0;
        if(x<0){ x=x-x-x; flag=true; } 
        while(x>0){
            digit=x%10;
            if (a > Integer.MAX_VALUE / 10 || (a == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (a < Integer.MIN_VALUE / 10 || (a == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
            a=a*10+digit;
            x=x/10;

        }
        
        if(flag==true) return -a;
        else return a;
    }
}