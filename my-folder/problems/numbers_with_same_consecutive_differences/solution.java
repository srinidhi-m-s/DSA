class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        Queue q=new LinkedList();int a;int b;
        for(int i=1;i<10;i++){
            q.add(i);
        }
        for(int j=0;j<n-1;j++){
        
        
        int size=q.size();
        for(int i=0;i<size;i++){
            int num=(int)q.poll();
            if(num==0){
                continue;
            }
            int x=(num%10);
            a=x+k;
            b=x-k;
            if(a==b){
                q.add((num*10)+a);
            }
            else{
                if(a<10){
                    q.add((num*10)+a);
                }
                if(b>=0){
                    q.add((num*10)+b);
                }
            }

        }
        }
        int size=q.size();
        int[] ans =new int[size];
        for(int i=0;i<size;i++){
            ans[i]=(int)q.poll();
        }
        return ans;   
    }
}