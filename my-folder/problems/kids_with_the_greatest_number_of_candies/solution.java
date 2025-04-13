class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>(10);
        int max=0;
        for(int i:candies){
            if(i>max) max=i;
        }
        for(int i:candies){
            if(i+extraCandies>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
            
    }
}