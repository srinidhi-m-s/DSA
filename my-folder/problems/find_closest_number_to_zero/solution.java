class Solution {
    public int findClosestNumber(int[] nums) {
        int closest=nums[0];
        int dist,distance;
        if(closest<0) distance=closest+(-2*closest);
        else distance=closest;
        for(int num:nums){
        
            if(num<0) dist=num+(-2*num);
            else dist=num;
            if(dist<distance || (dist==distance && num>0)) {
                closest =num;
                distance=dist;
            }
            
        }
        
        return closest;
    }
}