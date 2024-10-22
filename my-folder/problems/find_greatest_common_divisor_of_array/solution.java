class Solution {
    public int findGCD(int[] nums) {
        int min,max;
        int n=nums.length;
        min=nums[0];
        max=nums[n-1];
        for(int i=0;i<n;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            if(max<nums[i]){
                max=nums[i];
            }
        }
        for(int i=min;i>0;i--){
            if((max %i==0)&&(min%i==0)){
                return(i);

            }
        }
        return 0;
    }
    
}