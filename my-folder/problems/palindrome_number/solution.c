#include <math.h>
bool isPalindrome(int x){

int i,a=0,b=0,l=0;
int temp;
temp=x;
if (x==0){
    return true;
}
else if((x<0)||(x%10==0)){
    return false;
}

while(x!=0){
    l+=1;
    x/=10;
}
x=temp;

while(x>0){
     l=l-1;
    a=x%10;
    x/=10;
    b+=a*pow(10,l);
}

if(b==temp)
{
    return true;
}
else{
return false;
}
 
}