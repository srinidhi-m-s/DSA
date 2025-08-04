class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length==1) return 1;
        int left=0;int right=0;int ptr=left;int count=2;int max=count;boolean flag=false;
        while(left<fruits.length && ptr<fruits.length-1){
            ptr++; if((ptr-right)+1>fruits.length/2 ) flag=true;
            if(fruits[ptr]==fruits[left] || fruits[ptr]==fruits[right] ){ 
                count=(ptr-left)+1;
                if(count>max) max=count;
                
            }
            else if(right==left){
                count=(ptr-left)+1;
                if(count>max) max=count;
                right=ptr;
            } 
            else{
                if(flag==false){
                left++;
                ptr=right=left;
                count=0;
                }
                else break;
            }           

        }
        return max;
    }
}