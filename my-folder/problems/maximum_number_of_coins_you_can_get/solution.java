class Solution {
    public int maxCoins(int[] piles) {
        int n=piles.length;
        Arrays.sort(piles);
        int sum=0;
        int length=n/3;
        for(int i=length;i<n;i=i+2){
            sum+=piles[i];
        }
        return sum;
    }
    
}