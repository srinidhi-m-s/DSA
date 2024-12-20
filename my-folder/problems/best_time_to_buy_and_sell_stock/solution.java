class Solution {
    public int maxProfit(int[] prices) {
        int max=0;int min=0;        
        for(int j=1;j<prices.length;j++){
            if(prices[j]<prices[min]){
                min=j;
                continue;
            } 
            int diff=prices[j]-prices[min];
            if(diff>max){
                max=diff;
            }
        }
        
        return max;
    }
}