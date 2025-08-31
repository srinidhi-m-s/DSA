class Solution {
    public int maxProfit(int[] prices) {
        int min=0;int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[min]) min=i;
            else{
                int diff=prices[i]-prices[min];
                if(diff>max) max=diff;
            }
        }
        return max;
        
        
    }
}