class Solution {
    public boolean check(int[] a) {
        int n=a.length;int temp=a[0];
        int min=0;boolean flag=true;
        for(int i=0;i<n;i++){
            if(a[i]>=min){
                if(!flag && a[i]>temp) return false;
                min=a[i];
            }
            else{
                if(flag){
                    if(a[i]>temp) return false;
                    min=a[i];
                    flag=false;
                }
                else return false;
            }

        }
        return true;
        
    }
}